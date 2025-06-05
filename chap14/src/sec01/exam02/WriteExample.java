package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		// Quiz: 데이터 도착지를 test2.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		try (OutputStream os = new FileOutputStream("C:\\Temp\\test2.db")) {
			// 출력할 바이트 배열
			String str = "데이터 도착지를 test2.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성";
			byte[] array = str.getBytes();
			
			// 배열의 모든 바이트를 출력
			os.write(array);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
