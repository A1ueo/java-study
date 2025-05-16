package sec02.exam05;

public class ForNestedExample {
	public static void main(String[] args) {
		// 구구단 출력하기
		// 중첩 for문(여기서는 이중 for문 사용)
		for (int i = 1; i < 9; i++) {
			int num1 = i + 1;
			System.out.printf("**** %d 단 ****%n", num1);
			for (int j = 0; j < 9; j++) {
				int num2 = j + 1;
				System.out.printf("%d x %d = %d%n", num1, num2, num1 * num2);
			}
			System.out.println();
		}
		// 참고: for문 중첩 시 퍼포먼스가 떨어짐
		// 삼중을 넘어가면 잘 안씀
	}
}
