package homework.homework01;

public class Run {

	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] strArr = str.split("\n");
		Person[] persons = new Person[strArr.length];
		
		for(int i = 0; i < strArr.length; i++) {
			String[] tmp = strArr[i].split(",");
			persons[i] = new Person(tmp[0], Integer.parseInt(tmp[1]), tmp[2], tmp[3].charAt(0));
		}
		
		for(Person person : persons)
			System.out.println(person);
		
	}

}
