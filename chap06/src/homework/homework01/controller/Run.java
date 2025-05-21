package homework.homework01.controller;

import homework.homework01.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee kim = new Employee("김철수", "교육운영팀");
		Employee lee = new Employee("이영희", "경영지원팀");
		System.out.println(kim.name + " " + kim.team);
		System.out.println(lee.name + " " + lee.team);

	}

}
