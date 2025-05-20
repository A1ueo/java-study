package homework.homework04;

public class Run {

	public static void main(String[] args) {
		Controller myCtrl = new Controller();

		String msg1 = "전달된 메세지";
		myCtrl.printMessage(msg1);

		int sum = myCtrl.sum1To100();
		System.out.println(sum);

		String str1 = myCtrl.isOddEven(5);
		System.out.printf("%d: %s%n", 5, str1);
		String str2 = myCtrl.isOddEven(4);
		System.out.printf("%d: %s%n", 4, str2);

		String msg2 = "is english?";
		boolean hasAlpha1 = myCtrl.hasAlpha(msg1);
		System.out.printf("\"%s\"에 영단어가 포함되어 있나?: %s%n", msg1, hasAlpha1);
		boolean hasAlpha2 = myCtrl.hasAlpha(msg2);
		System.out.printf("\"%s\"에 영단어가 포함되어 있나?: %s%n", msg2, hasAlpha2);

		String msg3 = "i";
		int count1 = myCtrl.countAlpha(msg2);
		System.out.printf("\"%s\"의 문자 개수: %d%n", msg2, count1);
		int count2 = myCtrl.countAlpha(msg3);
		System.out.printf("\"%s\"의 문자 개수: %d%n", msg3, count2);

		int num1 = 5;
		System.out.println(num1 + "의 구구단");
		myCtrl.multiplication(num1);
	}

}
