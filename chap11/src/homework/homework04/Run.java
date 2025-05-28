package homework.homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.print("문자열: ");
			str = sc.nextLine();
			if("n".equalsIgnoreCase(str))
				break;
			sb.append(str);
		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println("최종 문자열: " + sb.toString());

	}

}
