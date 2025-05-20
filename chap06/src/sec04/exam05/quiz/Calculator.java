package sec04.exam05.quiz;

public class Calculator {
	int getEvenTotal(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
