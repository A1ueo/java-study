package homework.homework03;

public class Run {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		String str1 = myCalc.addString("안녕 ", "하세요.");
		System.out.println(str1);

		int num1 = myCalc.multiply(2, 3);
		System.out.println(num1);

		int num2 = myCalc.multiply(3, 2);
		System.out.println(num2);

		boolean check1 = myCalc.compareString("안녕", "하세요.");
		System.out.println("안녕 == 하세요. : " + check1);

		boolean check2 = myCalc.compareString("안녕", "안녕");
		System.out.println("안녕 == 안녕 : " + check2);
	}

}
