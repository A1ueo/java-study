package sec01.exam19;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);

	}

}
