package sec03.exam01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) {
		InputStream is = System.in; // 바이트 기반 입력 스트림
		Reader reader = new InputStreamReader(is);
	}
}
