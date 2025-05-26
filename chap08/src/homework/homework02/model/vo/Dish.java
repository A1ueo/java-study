package homework.homework02.model.vo;

public class Dish extends Menu {
	private String ingredients;

	public Dish() {
	}

	public Dish(String name, int price, String ingredients) {
		super(name, price);
		this.ingredients = ingredients;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public void cook() {
		String str = super.toString() + String.format("재료는 %s입니다.", ingredients);
		System.out.println(str);
	}

}
