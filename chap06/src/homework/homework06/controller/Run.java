package homework.homework06.controller;

import homework.homework06.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5, 3);
		rect1.PrintInfo();
		rect2.PrintInfo();

	}

}
