package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;		
		
		result += 10;
		System.out.println("result=" + result);	// 10
		
		result -= 5;
		System.out.println("result=" + result);	// 5	
		
		result *= 3;
		System.out.println("result=" + result);	// 15
		
		result /= 5;
		System.out.println("result=" + result);	// 3
		
		result %= 3;
		System.out.println("result=" + result);	// 0
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원:11개
//		100원:1개
//		50원:0개
//		10원:4개
//		1원:0개
		System.out.print("금액을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		sc.close();
		int fiveHundred = money / 500;
		money %= 500;
		int hundred = money / 100;
		money %= 100;
		int fifty = money / 50;
		money %= 50;
		int ten = money / 10;
		money %= 10;
		int one = money;
		System.out.printf("%d원: %d개\n", 500, fiveHundred);
		System.out.printf("%d원: %d개\n", 100, hundred);
		System.out.printf("%d원: %d개\n", 50, fifty);
		System.out.printf("%d원: %d개\n", 10, ten);
		System.out.printf("%d원: %d개\n", 1, one);

	}

}
