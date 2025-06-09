package sec03.exam03.quiz;

import java.io.File;

public class Quiz2 {
	// Quiz
//	먼저 "C:\test\sub" 폴더 아래에 test1.txt, test2.txt, test3.txt 파일을 만들어주세요.
	
//	FileManager 클래스에 deleteFile(dir: File): void 메소드를 정의합니다.
//	실행 클래스에서 FileManager 클래스를 객체화한 다음 deleteFile() 메소드를 호출하세요.
//	deleteFile()은 "C:\test\sub" 아래에 있는 파일들을 모두 삭제하는 기능을 수행합니다.
	
//	[출력]
//	C:\test\sub\2025 -> 삭제 안됨
//	C:\test\sub\test1.txt -> 삭제 완료
//	C:\test\sub\test2.txt -> 삭제 완료
//	C:\test\sub\test3.txt -> 삭제 완료
	
	public static void main(String[] args) throws Exception {
		File file1 = new File("C:\\test\\sub\\test1.txt");
		File file2 = new File("C:\\test\\sub\\test2.txt");
		File file3 = new File("C:\\test\\sub\\test3.txt");
		
		if (!file1.exists()) file1.createNewFile();
		if (!file2.exists()) file2.createNewFile();
		if (!file3.exists()) file3.createNewFile();
		
		
//		FileManager fm = new FileManager();
		FileManager.deleteFile(new File("C:\\test\\sub"));
		
		
	}

}
