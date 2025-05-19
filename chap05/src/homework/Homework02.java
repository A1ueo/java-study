package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ", i);
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int num : arr) {
			System.out.printf("%d ", num);
			sum += num;
		}
		System.out.println("\n총 합: " + sum);
	}

}
