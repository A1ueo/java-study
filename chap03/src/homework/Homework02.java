package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수: ");
		int n = sc.nextInt();
		String str = (n % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("구슬의 개수는 %s입니다.", str);
	}

}
