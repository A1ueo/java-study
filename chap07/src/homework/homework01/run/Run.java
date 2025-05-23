package homework.homework01.run;

import java.util.Scanner;

import homework.homework01.model.vo.Employee;
import homework.homework01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] studentsArr = new Student[] { new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과"),
				new Student("이영희", 23, 167.0, 54.0, 4, "물리학과"), new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과") };

		for (Student std : studentsArr)
			System.out.println(std.toString());

		Employee[] employeesArr = new Employee[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 사원 입력받기 ===");
		boolean flag = true;
		int empCount = 0;
		while (flag) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("나이: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("키: ");
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.print("몸무게: ");
			double weight = sc.nextDouble();
			sc.nextLine();
			System.out.print("급여: ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서: ");
			String dept = sc.nextLine();
			employeesArr[empCount++] = new Employee(name, age, height, weight, salary, dept);

			char check;
			System.out.print("계속 추가하시겠습니까? ");
			while (true) {
				check = sc.nextLine().charAt(0);
				if (check == 'n' || check == 'N') {
					flag = false;
					break;
				} else if (check == 'y' || check == 'Y') {
					flag = true;
					break;
				}
				System.out.print("다시 입력하세요(Y/N) ");
			}
		}

		for (int i = 0; i < empCount; i++) {
			System.out.println(employeesArr[i]);
		}
	}

}
