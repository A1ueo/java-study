package homework.homework02.model.vo;

public class Person {
	private String name;
	private String address;
	public String phone;
	public double height;
	public double weight;

	public Person(String phone, double height, double weight) {
		this.phone = phone;
		this.height = height;
		this.weight = weight;
	}
}
