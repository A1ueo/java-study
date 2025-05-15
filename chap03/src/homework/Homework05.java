package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-): ");
		int num = sc.nextLine().charAt(7) - '0';
		String str = (num == 1 || num == 3) ? "남성입니다." : (num == 2 || num == 4) ? "여성입니다." : "잘못된 값입니다.";
		System.out.println("입력하신 주민번호는 " + str);
	}

}
