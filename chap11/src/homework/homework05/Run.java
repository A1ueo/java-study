package homework.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("암호: ");
		String date = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(name.charAt(0));
		sb.append(date.substring(2, 4));
		sb.append(date.substring(6, 8));
		sb.append(name.substring(1));
		System.out.print("암호: ");
		System.out.println(sb.toString());
	}

}
