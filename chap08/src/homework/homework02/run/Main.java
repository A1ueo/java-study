package homework.homework02.run;

import homework.homework02.model.vo.Dish;
import homework.homework02.model.vo.Drink;
import homework.homework02.model.vo.Menu;

public class Main {

	public static void main(String[] args) {
		Menu[] menuArr = { new Dish("수프", 3000, "옥수수"), new Drink("콜라", 1000, "콜라"), 
				new Drink("사이다", 1000, "제로 사이다"), new Dish("스파게티", 7000, "토마토"), 
				new Dish("돈까스", 9000, "돼지고기") };

		for (Menu menu : menuArr) {
			menu.cook();
		}

	}

}
