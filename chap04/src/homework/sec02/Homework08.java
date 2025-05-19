package homework.sec02;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int flag = 1;
		while (flag == 1) {
			String str;
			char c;
			char repeat;

			System.out.print("문자열: ");
			str = sc.nextLine();
			System.out.print("문자: ");
			c = sc.nextLine().charAt(0);

			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c)
					count++;
			}
			System.out.println("포함된 개수: " + count);

			do {
				System.out.print("다시 입력하시겠습니까?: ");
				repeat = sc.nextLine().charAt(0);

				if (repeat == 'n' || repeat == 'N') { // str.equalsIgnoreCase()
					flag = 0;
				} else if (repeat == 'y' || repeat == 'Y') {
					flag = 1;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					flag = -1;
				}
			} while (flag == -1);
		}

		System.out.println("프로그램 종료");
	}
}
