package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 일기예보 ===");
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("기온: ");
		int temp = sc.nextInt();
		
		String str;
		switch (month) {
		case 3:
		case 4:
		case 5:
			str = "봄";
			break;

		case 6:
		case 7:
		case 8:
			str = "여름";
			if(temp >= 35)
				str += " 폭염 경보";
			else if (temp >= 33)
				str += " 폭염 주의보";
			break;

		case 9:
		case 10:
		case 11:
			str = "가을";
			break;

		case 12:
		case 1:
		case 2:
			str = "겨울";
			if (temp <= -15)
				str += " 한파 경보";
			else if (temp <= -12)
				str += " 한파 주의보";
			break;

		default:
			str = "해당하는 계절이 없습니다";
			break;
		}
		System.out.println(str);
	}
}
