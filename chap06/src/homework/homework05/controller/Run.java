package homework.homework05.controller;

import homework.homework05.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		member.changeName("홍길동");
		member.printName();

	}

}
