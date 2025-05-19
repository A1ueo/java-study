package homework.sec02;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			str = sc.nextLine();
		} while (!"no".equals(str));
		System.out.println("게임을 종료합니다.");
	}

}
