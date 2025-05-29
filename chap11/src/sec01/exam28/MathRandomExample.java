package sec01.exam28;

public class MathRandomExample {

	public static void main(String[] args) {
		// 공식화: (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		
		// 1부터 10까지 임의의 정수 난수 얻기
		int randInt = (int) (Math.random() * 10) + 1;
		System.out.println("랜덤: " + randInt);
		
		// Quiz: 주사위 번호 뽑기(1, 2, 3, 4, 5, 6)
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위: " + dice);
		
		// Quiz: 로또 번호 뽑기(1, 2, 3, ... 43, 44, 45)
		int lottery = (int) (Math.random() * 45) + 1;
		System.out.println("로또: " + lottery);
		
	}

}
