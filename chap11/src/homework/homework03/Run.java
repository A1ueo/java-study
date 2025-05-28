package homework.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 주소를 입력하세요: ");
		String email = sc.nextLine().trim();
		
		int idx = 0;
		if((idx = email.lastIndexOf("@")) == -1 || 
				!"@goodee.co.kr".equals(email.substring(idx))) {
			System.out.println("유효하지 않은 이메일입니다.");
			System.out.println(email.substring(idx));
		}
		else {
			System.out.print("아이디: ");
			System.out.println(email.substring(0, idx));
		}

	}

}
