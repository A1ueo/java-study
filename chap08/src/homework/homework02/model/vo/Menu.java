package homework.homework02.model.vo;

public abstract class Menu {
	private String name;
	private int price;

	protected Menu() {
	}

	protected Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("메뉴명은 %s이고, 가격은 %d원입니다. ", name, price);
	}

	public abstract void cook();

}
