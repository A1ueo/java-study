package homework.sec02;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		do {
			System.out.print("숫자(0을 입력하면 종료): ");
			n = sc.nextInt();
			if (n > 0)
			sum += n;
		} while (n != 0);
		System.out.printf("양수의 합계: %d%n", sum);

	}

}
