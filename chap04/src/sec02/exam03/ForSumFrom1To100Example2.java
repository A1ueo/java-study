package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		int idx = 0;
		for (; idx < 100; idx++) {
			sum += (idx + 1);
		}
		System.out.printf("1 ~ %d 합: %d%n", idx, sum);

		// (참고) 무한 루프
		int count = 0;
		for (/* 초기화식 */;/* 조건식 */;/* 증감식 */) {
			System.out.println("무한 반복");
			count++;
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;
			}
		}

		// Quiz: 1부터 100까지 짝수의 합
		int even = 0;
		for (idx = 0; idx < 100; idx++) {
			if ((idx + 1) % 2 == 0) {
				even += (idx + 1);
			}
		}
		System.out.printf("1부터 %d까지 짝수의 합: %d%n", idx, even);

		// Quiz2:
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oddEven = (n % 2 == 0) ? 0 : 1;
		sum = 0;
		for (int i = 0; i < n; i++) {
			int num = i + 1;
			if (num % 2 == oddEven) {
				sum += num;
			}
		}
		String str = (oddEven == 0) ? "짝수" : "홀수";
		System.out.printf("%d부터 %d까지 %s의 합: %d%n", 2 - oddEven, n, str, sum);
	}

}
