package homework.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char repeat;
		char[] answers = { 'y', 'Y', 'n', 'N' };

		do {
			String str;
			char c;
			System.out.print("문자열: ");
			str = sc.nextLine();
			System.out.print("문자: ");
			c = sc.nextLine().charAt(0);
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c)
					count++;
			}
			System.out.printf("포함된 개수: %d%n", count);
			do {
				System.out.print("다시 입력하시겠습니까?: ");
				repeat = sc.nextLine().charAt(0);
				if (!Arrays.asList(answers).contains(repeat)) {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			} while (!Arrays.asList(answers).contains(repeat));

		} while (repeat != 'n' || repeat != 'N');
	}

}
