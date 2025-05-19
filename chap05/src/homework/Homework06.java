package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요: ");
		int len = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[len];
		for (int i = 0; i < len; i++) {
			System.out.printf("%d번째 문자열: ", i + 1);
			arr[i] = sc.nextLine();
		}

		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
			String repeat = sc.nextLine();
			if ("n".equalsIgnoreCase(repeat))
				break;
			else if (!"y".equalsIgnoreCase(repeat)) {
				System.out.println("입력할 수 없는 값입니다.");
				continue;
			}

			System.out.print("더 입력하고 싶은 개수: ");
			int addLen = sc.nextInt();
			sc.nextLine();
			int oldLen = arr.length;
			arr = Arrays.copyOf(arr, oldLen + addLen);
			for (int i = 0; i < addLen; i++) {
				System.out.printf("%d번째 문자열: ", oldLen + i + 1);
				String tmp = sc.nextLine();
				arr[oldLen + i] = tmp;
			}
		}

		for (String str : arr) {
			System.out.println(str);
		}
	}

}
