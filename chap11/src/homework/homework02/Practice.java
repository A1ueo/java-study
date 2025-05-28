package homework.homework02;

public class Practice {
	public static String takeState(String str) {
		String[] strArr = str.split(" ");
		for(String s : strArr) {
			if(s.lastIndexOf("구") == s.length() - 1)
				return s;
		}
		
		return "null";
	}
}
