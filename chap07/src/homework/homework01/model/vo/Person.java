package homework.homework01.model.vo;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;

	public Person() {
	}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String toString() {
		return String.format("=== %s ===%n나이: %d%n키: %.1f%n몸무게: %.1f", name, age, height, weight);
	}
}
