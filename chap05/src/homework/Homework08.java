package homework;

import java.util.Arrays;

public class Homework08 {

	public static void main(String[] args) {
		String[] menu = { "Burger", "Pizza", "Pasta" };
		String[] add = { "Salad", "Soup" };
		String[] newMenu = Arrays.copyOf(menu, menu.length + add.length);
		for (int i = 0; i < add.length; i++) {
			newMenu[menu.length + i] = add[i];
		}
		System.out.print("어제 메뉴판: ");
		for (String str : menu) {
			System.out.print(str + ", ");
		}
		System.out.print("\n오늘 메뉴판: ");
		for (String str : newMenu) {
			System.out.print(str + ", ");
		}

	}

}
