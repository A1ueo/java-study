package homework.homework01.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;

	public Employee() {
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%n급여: %d%n부서: %s", salary, dept);
	}

}
