package homework.homework02.model.vo;

public class GreenTea extends Cake {
	private double powder;
	private int cheese;

	public GreenTea() {
		super();
	}

	public GreenTea(double flour, double cream, double powder, int cheese) {
		super(flour, cream);
		this.powder = powder;
		this.cheese = cheese;
	}

	public double getPowder() {
		return powder;
	}

	public void setPowder(double powder) {
		this.powder = powder;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%n녹차 파우더: %.1f(g)%n치즈 큐브: %d(개)", powder, cheese);
	}
}
