package sec01.exam04;

import java.util.HashMap;

public class MemberExam {

	public static void main(String[] args) {
		HashMap<Member, String> hashMap = new HashMap<>();

		hashMap.put(new Member("fall"), "value1");
		hashMap.put(new Member("winter"), "value2");
		hashMap.put(new Member("fall"), "value3");

		System.out.println(hashMap.size());
	}

}
