package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		// Quiz: 데이터 도착지를 test2.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		try (OutputStream os = new FileOutputStream("C:\\Temp\\test3.db")) {
			// 출력할 바이트 배열
			byte[] array = {65, 66, 67, 68, 69};
			
			// 주어진 배열의 off부터 len개 까지의 바이트를 출력
			os.write(array, 1, 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
