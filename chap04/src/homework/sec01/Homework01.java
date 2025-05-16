package homework.sec01;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age = sc.nextInt();
		String pay;
		if (age < 3) {
			pay = "무료";
		} else if (age < 13) {
			pay = "10000원";
		} else if(age < 19) {
			pay = "20000원";
		} else if(age < 65) {
			pay = "30000원";
		} else {
			pay = "무료";
		}

		System.out.printf("당신의 놀이동산 요금은 %s입니다.", pay);
	}
}
