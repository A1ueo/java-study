package homework.sec01;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 철수네 공장 ===");
		System.out.print("수집된 코드: ");
		int code = sc.nextInt();
		String str;
		switch (code) {
		case 400:
			str = "잘못된 요청입니다.";
			break;
		case 404:
			str = "요청하신 서비스를 찾을 수 없습니다.";
			break;
		case 500:
			str = "처리 방법을 알 수 없는 문제가 발생했습니다.";
			break;
		case 503:
			str = "일시적인 서버 오류가 발생하였습니다.";
			break;

		default:
			str = "알 수 없는 오류가 발생하였습니다.";
			break;
		}
		System.out.println(str);
	}
}
