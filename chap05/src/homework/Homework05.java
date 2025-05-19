package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] choices = { "가위", "바위", "보" };
		int count = 0, win = 0, draw = 0, lose = 0;

		String str;
		while (true) {
			System.out.print("가위바위보: ");
			str = sc.nextLine();
			if ("stop".equals(str)) {
				System.out.printf("%d전 %d승 %d무 %d패", count, win, draw, lose);
				break;
			} else {
				boolean isInChoices = false;
				for (String s : choices) {
					if (s.equals(str))
						isInChoices = true;
				}
				if (isInChoices) {
					int randInt = (int) (Math.random() * 3);
					System.out.println("컴퓨터: " + choices[randInt]);
					System.out.println("사용자: " + str);

					int user = Arrays.asList(choices).indexOf(str);
					if (user == randInt) {
						System.out.println("비겼습니다.");
						draw++;
					} else if (user == (randInt + 1) % 3) {
						System.out.println("이겼습니다!");
						win++;
					} else {
						System.out.println("졌습니다 ㅠㅠ");
						lose++;
					}
					System.out.println();
					count++;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}

	}

}
