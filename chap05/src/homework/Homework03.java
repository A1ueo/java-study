package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("정수: ");
			n = sc.nextInt();
			if (n % 2 == 0 || n < 3)
				System.out.println("다시 입력하세요.");
		} while (n % 2 == 0 || n < 3);

		int[] arr = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
//			if (i > n / 2) {
//				arr[i] = --count;
//			} else {
//				arr[i] = ++count;
//			}
			arr[i] = (i > n / 2) ? --count : ++count;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1)
				System.out.print(", ");
		}

	}

}
