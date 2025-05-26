package sec02.exam04.quiz;

public class Dog extends Animal {

	public Dog() {
		this("강아지", 4);
	}

	public Dog(String kind, int leg) {
		super(kind, leg);
	}

	@Override
	public void eat() {
		System.out.println("주인이 주는대로 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("멍멍 짖는다.");
	}

}
