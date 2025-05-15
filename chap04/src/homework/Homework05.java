package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 헬스 마니아 철수 ===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		int num = sc.nextInt();

		String str = "";

		if (num == 1) {
			str = "스쿼트";
		} else if (num == 2) {
			str = "데드리프트";
		} else if (num == 3) {
			str = "벤치 프레스";
		} else if (num == 4) {
			str = "풀업";
		}

		if (num > 0 && num < 5) {
			str += " 운동 시간입니다.";
		} else if (num == 5) {
			str = "오늘도 수고하셨습니다.";
		} else {
			str = "목록에 있는 숫자만 입력해주세요.";
		}

		System.out.println(str);
	}
}
