package sec02.exam06;

public class WhilePrint1To10Example {
	public static void main(String[] args) {
		// 1부터 10까지 반복해서 출력
		int count = 0; // 초기화식
		while (count < 10) { // 조건식
			System.out.println(count + 1);
			count++; // 증감식, 이게 빠지면 무한 루프에 빠짐
		}
	}
}
