package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\Temp\\test9.txt");
		
		char[] arr = {'A', 'B', 'C', 'D', 'E'};
		
		// 주어진 배열의 off부터 len개 까지의 바이트를 출력
		writer.write(arr, 1, 3); // 1번 인덱스부터 3개를 출력
		
		writer.flush();
		writer.close();
	}
}
