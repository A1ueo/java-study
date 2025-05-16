package sec02.exam07;

public class WhileSum1To100Example {
	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		int count = 0; // 초기화식
		while (count < 100) { // 조건식
			int num = count + 1;
			sum += num;
			count++; // 증감식, 이게 빠지면 무한 루프에 빠짐
		}
		System.out.printf("1부터 %d까지 합: %d%n", count, sum);

		// (참고) 무한 루프
		while (true) {
			System.out.println("무한 반복");

			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) {
				break;
			}
		}

		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");

			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) {
				flag = false;
			}
		}

		// 1부터 100까지 합
		// do-while문으로 작성
		sum = 0;
		count = 0;
		do { // 처음 한번은 무조건 실행
			int num = count + 1;
			sum += num;
			count++; 
		} while (count < 100); // 세미콜론 필수!
		System.out.printf("1부터 %d까지 합: %d%n", count, sum);
	}
}
