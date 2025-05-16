package homework.sec02;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("숫자: ");
			n = sc.nextInt();
			if (n > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} else if (n < 0) {
				System.out.println("양수만 입력해주세요.");
			} else if (n != 0) {
				for (int i = n; i <= 9; i++) {
					System.out.printf("=== %d단 ===%n", n);
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d%n", i, j, i * j);
					}
				}
			}
		} while (n != 0);
		System.out.println("프로그램 종료");


	}

}
