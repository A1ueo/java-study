package homework.homework02.controller;

import homework.homework02.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person("01012345678", 190.5, 100.2);
		Person p2 = new Person("01056434563", 175.4, 175.4);
		System.out.printf("%s %.2f %.2f%n", p1.phone, p1.height, p1.weight);
		System.out.printf("%s %.2f %.2f%n", p2.phone, p2.height, p2.weight);

	}

}
