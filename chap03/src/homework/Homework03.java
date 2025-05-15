package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수: ");
		int friend = sc.nextInt();
		System.out.print("사탕의 수: ");
		int candy = sc.nextInt();
		System.out.printf("1인당 사탕 개수: %d개\n", candy / friend);
		System.out.printf("남은 사탕 개수: %d개\n", candy % friend);
	}

}
