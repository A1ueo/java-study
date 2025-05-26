package homework.homework01.model.vo;

public class Food extends Product {
	private int expirationDays;

	public Food() {
	}

	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	public int getExpirationDays() {
		return expirationDays;
	}

	public int calculateDiscountRate() {
		int discount = 0;
		if (expirationDays <= 1)
			discount = 80;
		else if (expirationDays <= 5)
			discount = 50;
		else if (expirationDays <= 10)
			discount = 20;

		return discount;
	}

	@Override
	public int calculatePrice() {
		int price = super.getPrice() * (100 - calculateDiscountRate()) / 100;
		return price;
	}

}
