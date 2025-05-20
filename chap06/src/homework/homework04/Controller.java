package homework.homework04;

public class Controller {
	void printMessage(String str) {
		System.out.println("메세지: " + str);
	}

	int sum1To100() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i + 1;
		}
		return sum;
	}

	String isOddEven(int num) {
		String str;
		if (num % 2 == 0)
			str = "짝수";
		else
			str = "홀수";
		return str;
	}

	boolean hasAlpha(String str) {
		boolean check = false;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				check = true;
			}
		}
		return check;
	}

	int countAlpha(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				count++;
			}
		}
		return count;
	}

	void multiplication(int num) {
		System.out.println(num + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d%n", num, i, num * i);
		}
	}

}
