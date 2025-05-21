package homework.homework09.controller;

import homework.homework09.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		std1.setName("김철수");
		std2.setName("홍길동");
		std3.setName("이영희");

		std1.setClassName("A");
		std2.setClassName("F");
		std3.setClassName("B");

		System.out.printf("%d %s %s%n", std1.getStdNum(), std1.getName(), std1.getClassName());
		System.out.printf("%d %s %s%n", std2.getStdNum(), std2.getName(), std2.getClassName());
		System.out.printf("%d %s %s%n", std3.getStdNum(), std3.getName(), std3.getClassName());

	}

}
