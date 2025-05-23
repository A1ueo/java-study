package homework.homework02.controller;

import homework.homework02.model.vo.GreenTea;

public class GreenTeaController {
	private GreenTea gt = new GreenTea();

	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		return gt.toString();
	}

}
