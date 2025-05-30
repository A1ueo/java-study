package sec01.exam01_2;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

//	public Student() {
//	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Student other)) return false;
		else return this.name.equals(other.name) && this.age == other.age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public int compareTo(Student other) {
		// compareTo()의 리턴값 의미
		// 음수: this < other - this가 앞에 온다
		// 양수: this > other - this가 뒤에 온다
		// 0: this == other - 순서 유지
		
		// 나이 오름차순
		// 25 - 30 = -5 -> 음수 -> 25세가 앞에 감
		return this.age - other.age;
		
		// 나이 내림차순
		// 30 - 25 = 양수 -> 30세가 앞에 감
//		return other.age - this.age;
		
		// 나이 오름차순을 풀어서 쓰면
//		if(this.age < other.age) return -1;
//		else if(this.age > other.age) return 1;
//		else return 0;
		
		// 문자열은 연산자로 비교 불가능
		// String의 재정의된 compareTo() 메소드 사용
		// 기준 문자열이 사전상 뒤면 자리 바꿈
		// 기준 문자열이 사전상 앞이면 그대로 유지
		
//		"아무개".compareTo("홍길동"); -> 음수 -> "아무개"가 앞에 감
//		return this.name.compareTo(other.name); // 오름차순
//		return other.name.compareTo(this.name); // 내림차순
		
		// 복합 비교 가능
		// 기본 정렬은 나이 오름차순
		// 나이가 같으면 이름순
//		if(this.age != other.age) {
//			// 나이 오름차순
//			return this.age - other.age;
//		} else {
//			// 이름순
//			return this.name.compareTo(other.name); // 오름차순
//		}
	}

}
