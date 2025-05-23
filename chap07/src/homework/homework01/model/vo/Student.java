package homework.homework01.model.vo;

public class Student extends Person {
	private int grade;
	private String major;

	public Student() {
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%n학년: %d%n전공: %s", grade, major);
	}
}
