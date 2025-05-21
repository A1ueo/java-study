package homework.homework06.model.vo;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle() {
		width = 1;
		height = 1;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int CalculateRound() {
		return (width + height) * 2;
	}

	public int CalculateArea() {
		return width * height;
	}

	public void PrintInfo() {
		System.out.println("1. 사격형의 둘레");
		System.out.println(CalculateRound() + "cm");
		System.out.println("2. 사격형의 넓이");
		System.out.println(CalculateArea() + "cm");
	}
}
