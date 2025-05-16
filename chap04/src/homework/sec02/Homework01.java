package homework.sec02;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("정수(1~50): ");
			n = sc.nextInt();
			if (!(n >= 1 && n <= 50))
				System.out.println("1~50 사이의 정수를 입력하세요.");
		} while (!(n >= 1 && n <= 50));

		int sum = 0;
		for (int i = 0; i < n; i++) {
			int num = i + 1;
			if (num % 2 == 0)
				sum += num;
		}
		System.out.printf("합계: %d", sum);
	}

}
