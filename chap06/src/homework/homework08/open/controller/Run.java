package homework.homework08.open.controller;

import homework.homework08.open.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김철수";
		p1.age = 20;
		System.out.println(p1.name + " " + p1.age);
	}

}
