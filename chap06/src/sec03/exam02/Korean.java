package sec03.exam02;

public class Korean {
	// 필드
	String nation = "대한민국"; // 한국인 객체니가 국적은 고정값
	String name;
	String ssn;

	// 생성자
//	public Korean(String n, String s) {
//		this.name = n;
//		this.ssn = s;
//	}

	public Korean(String name, String ssn) {
//		name = name; // 양쪽 다 매개변수 name으로 인식됨
//		ssn = ssn;
		this.name = name;
		this.ssn = ssn;
		// 여기서 this는 객체 자기 자신을 참조
		// 객체 내부에서 자기 자신을 가리킬 때 사용
	}
}
