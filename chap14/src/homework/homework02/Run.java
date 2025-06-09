package homework.homework02;

public class Run {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		Practice.method1("C:\\test\\sub\\나비야1.dat");
		long end =System.nanoTime();
		System.out.println("method1: " + (end - start));
		
		start = System.nanoTime();
		Practice.method2("C:\\test\\sub\\나비야2.dat");
		end =System.nanoTime();
		System.out.println("method2: " + (end - start));

	}

}
