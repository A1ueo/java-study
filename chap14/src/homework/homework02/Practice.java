package homework.homework02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Practice {

	public static void method1(String path) {
		try (FileInputStream fis = new FileInputStream(path)) {
			byte[] buff = new byte[1000];
			int bytesRead;
			while ((bytesRead = fis.read(buff)) != -1) {
				String song = new String(buff, 0, bytesRead);
//				System.out.print(song);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method2(String path) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path))) {
//			byte[] buff = bis.readAllBytes();
//			String song = new String(buff);
//			System.out.println(song);
			byte[] buff = new byte[1000];
			int bytesRead;
			while ((bytesRead = bis.read(buff)) != -1) {
				String song = new String(buff, 0, bytesRead);
//				System.out.print(song);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
