package homework.homework02.model.vo;

public class Cake {
	private double flour;
	private double cream;

	public Cake() {
	}

	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getCream() {
		return cream;
	}

	public void setCream(double cream) {
		this.cream = cream;
	}

	public String toString() {
		return String.format("밀가루: %.1f(g)%n크림: %.1f(g)", flour, cream);
	}
}
