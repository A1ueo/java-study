package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Temp\\test3.db");
		
		byte[] buff = new byte[5];
		
		// 입력 스트림으로부터 3바이트를 읽고, 인덱스 2부터 순차적으로 저장
		int readByteNum = is.read(buff, 2, 3);
		is.close();
		
		if (readByteNum != -1) { // 읽은 바이트가 있다면
			for (int i = 0; i < buff.length; i++)
				System.out.println((char) buff[i]);
		}
		
	}
}
