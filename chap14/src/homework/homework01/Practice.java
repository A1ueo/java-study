package homework.homework01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Practice {
	
	public static void method1(String song) {
		try (OutputStream os = new FileOutputStream("C:\\test\\sub\\나비야1.dat")) {
			os.write(song.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void method2(String song) {
		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:\\test\\sub\\나비야2.dat"))) {
			bos.write(song.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
