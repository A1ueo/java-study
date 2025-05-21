package homework.homework08.close.controller;

import homework.homework08.close.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김철수");
		p1.setAge(20);
		System.out.printf("%s는 %d살 입니다.%n", p1.getName(), p1.getAge());
	}

}
