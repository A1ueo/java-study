package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		System.out.print("말해보세요: ");
		Scanner sc = new Scanner(System.in);
		String strInput = sc.nextLine();
//		String str = strInput.equals("간다") ? "온다" : "간다";
		// strInput에 null이 들어와도 에러가 발생하지 않음
		// nullptr Exception
		String str = "간다".equals(strInput) ? "온다" : "간다";
		System.out.println("앵무새: " + str);
	}

}
