package sec02.exam03;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		int i = 0;
		for (; i < 100; i++) {
			sum += (i + 1);
		}
		System.out.printf("1 ~ %d 합: %d%n", i, sum);

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
		for (i = 0; i < 100; i++) {
			if ((i + 1) % 2 == 0) {
				even += (i + 1);
			}
		}
		System.out.printf("1부터 %d까지 짝수의 합: %d%n", i, even);
	}

}
