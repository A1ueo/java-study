package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();

		int total = kor + math + eng;
		double avg = total / 3.0;
		System.out.println("합계: " + total);
		System.out.printf("평균: %.2f\n", avg);

		String str = avg > 90 ? "휴대폰 바꿔주세요" : "휴대폰을 바꿀 수 없습니다.";
		System.out.println(str);
	}

}
