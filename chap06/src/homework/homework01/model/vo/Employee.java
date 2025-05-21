package homework.homework01.model.vo;

public class Employee {
	public String name;
	public String team;
	String position;
	int pay;
	private int bonus;

	public Employee(String name, String team) {
		this.name = name;
		this.team = team;
	}

}
