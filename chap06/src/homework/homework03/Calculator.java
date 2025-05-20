package homework.homework03;

public class Calculator {

	String addString(String str1, String str2) {
		return str1 + str2;
	}

	int multiply(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			return num1 * num2;
		}
	}

	boolean compareString(String str1, String str2) {
		return str1.equals(str2);
	}
}
