package homework.homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		int rand = (int)(Math.random() * 50) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 ~ 50 사이의 숫자: ");
			String userInput = sc.nextLine();
			int userNum = -1;
			try {
				userNum = Integer.parseInt(userInput);
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				continue;
			}
			
			if(userNum > rand) {
				System.out.println("Down!");
			} else if(userNum < rand) {
				System.out.println("Up!");
			} else {
				System.out.println("축하합니다~ 정답이에요");
			}
		}
		
	}
}
