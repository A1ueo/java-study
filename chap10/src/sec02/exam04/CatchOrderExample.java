package sec02.exam04;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
//		} catch (Exception e) { // 에러 메세지: Unreachable catch block
//			System.out.println("실행에 문제가 있습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다. " + e);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다. " + e);
		} catch (Exception e) { // 모든 에외는 Exception을 상속 받음, 다형성에 의해 모든 예외 객체가 대입 가능
			// Exception 타입을 쓰는 경우는? 예외와 상관없이 공통적으로 예외 처리를 할 때
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}
}
