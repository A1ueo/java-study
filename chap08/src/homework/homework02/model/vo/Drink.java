package homework.homework02.model.vo;

public class Drink extends Menu {
	private String recipe;

	public Drink() {
	}

	public Drink(String name, int price, String recipe) {
		super(name, price);
		this.recipe = recipe;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	@Override
	public void cook() {
		String str = super.toString() + String.format("레시피는는 %s입니다.", recipe);
		System.out.println(str);
	}
}
