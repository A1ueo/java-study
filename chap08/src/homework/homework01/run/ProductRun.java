package homework.homework01.run;

import homework.homework01.model.vo.Book;
import homework.homework01.model.vo.Food;
import homework.homework01.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		Product product1;
		Product product2;

		product1 = new Food("치킨", 20000, 3);
		product2 = new Book("자바의 정석", 15000);

		System.out.printf("%s의 최종 가격: %d%n", product1.getName(), product1.calculatePrice());
		System.out.printf("%s의 최종 가격: %d%n", product2.getName(), product2.calculatePrice());

	}

}
