package sec03.exam04.quiz;

// Quiz
// 다른 생성자를 호출하는 this()를 써서 리팩토링 해보세요.

public class Animal {
	String kind;
	int age;

	Animal(String kind) {
		this(kind, 1);
	}

	Animal(int age) {
		this("사람", age);
	}

	// 최종 목적지 한 군데에서만 초기화 수행
	Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

	// 출력 메소드
	void info() {
		System.out.printf("%s: %d살%n", kind, age);
	}
}
