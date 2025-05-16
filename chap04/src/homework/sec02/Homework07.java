package homework.sec02;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("정수: ");
			n = sc.nextInt();
			if (!(n > 0))
				System.out.println("양수가 아닙니다.");
		} while (!(n > 0));

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print("박");
			} else {
				System.out.print("수");
			}

		}
	}

}
