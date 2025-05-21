package homework.homework07.controller;

import homework.homework07.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpNo(100);
		emp1.setEmpName("홍길동");
		emp1.setDept("영업부");
		emp1.setJob("과장");
		emp1.setAge(25);
		emp1.setGender('남');
		emp1.setSalary(3000000);
		emp1.setBonus(0.05);
		emp1.setPhone("010-123-4567");
		emp1.setAddress("서울시 강남구");

		System.out.printf("=== %s의 정보 ===%n", emp1.getEmpName());
		System.out.printf("사번: %d%n", emp1.getEmpNo());
		System.out.printf("부서: %s%n", emp1.getDept());
		System.out.printf("직급: %s%n", emp1.getJob());
		System.out.printf("나이: %d%n", emp1.getAge());
		System.out.printf("월급: %d%n", emp1.getSalary());
		System.out.printf("전화번호: %s%n", emp1.getPhone());
		System.out.printf("주소: %s%n", emp1.getAddress());
	}

}
