package sec01.exam22_quiz_string;

import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	입력된 문자열 중 숫자들의 합계를 출력하시오.

//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45

//	[출력]
//	1) 15
//	2) 15
//	3) 15
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int sum = 0;
		char[] charArr = str.toCharArray();
		// 숫자인지 직접 체크: '0' ~ '9' 사이인지 확인
		// 참고: Character.isDigit(ch)
		for(char c : charArr) {
			if(c >= '0' && c <= '9')
				// 참고: Character.getNumericValue(c);
				sum += c - '0';
		}
		
		System.out.println(sum);
		
	}

}
