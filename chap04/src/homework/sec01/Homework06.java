package homework.sec01;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 합격인가? 불합격인가? ===");
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int swDesign = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int swDev = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int db = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int lang = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int infoSys = sc.nextInt();

		int avg = (swDesign + swDev + db + lang + infoSys) / 5;

		// Early Return 패턴
		// 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공케이스는 마지막에 처리하는 구조
		// 장점: 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음

		if (avg < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else if (swDesign < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if (swDev < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (db < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (lang < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (infoSys < 40) {
			System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		} else {
			System.out.println("합격을 축하합니다!");
		}

	}
}
