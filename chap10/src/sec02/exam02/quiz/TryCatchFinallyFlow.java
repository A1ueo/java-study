package sec02.exam02.quiz;

public class TryCatchFinallyFlow {
	public static void main(String[] args) {
		// Quiz: 실행 흐름 예측해보기

		// 1. 예외가 발생하지 않은 경우
		System.out.print(1);
		try {
			System.out.print(2);
			System.out.print(3);
		} catch (Exception e) {
			System.out.print(4);
		} finally {
			System.out.print(5);
		}
		System.out.println(6);
		// 정답: 12356

		// 2. 예외가 발생한 경우
		String err = " ";
		System.out.print(1);
		try {
			System.out.print(2);

			System.out.print(0 / 0); // 예외 발생 => 발생한 예외와 일치하는 catch 블럭이 있는지 확인 => 예외 처리됨

			System.out.print(3);
		} catch (ArithmeticException e) {
			System.out.print(4);
			err = e.toString();
		} finally {
			System.out.print(5);
		}
		System.out.println(6);
		System.out.println(err);
		// 정답: 12456

		// 3. 예외가 발생한 경우
		System.out.print(1);
		try {
			System.out.print(2);

			System.out.print(args[0]);
			// 예외 발생 => 발생한 예외와 일치하는 catch 블럭을 찾지 못하면 예외는 처리되지 못함 => 비정상 종료

			System.out.print(3);
		} catch (ArithmeticException e) {
			System.out.print(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		// 정답: 125 (비정상 종료됨)

	}
}
