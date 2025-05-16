package homework.sec02;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.print("입력: ");
			str = sc.nextLine();
			if (str.equals("탈출"))
				break;
			System.out.println(str);
		} while (true);
		System.out.println("프로그램 종료");
	}

}
