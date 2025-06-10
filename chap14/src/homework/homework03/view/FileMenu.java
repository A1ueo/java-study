package homework.homework03.view;

import java.io.File;
import java.util.Scanner;

import homework.homework03.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.print(" ***** My Note ***** \r\n"
					+ "1. 노트 새로 만들기\r\n"
					+ "2. 노트 열기\r\n"
					+ "3. 노트 열어서 수정하기\r\n"
					+ "9. 끝내기\r\n"
					+ "메뉴 번호 : ");
			String input = sc.nextLine();
			switch (input) {
			case "1":
				fileSave();
				break;
			case "2":
				fileOpen();
				break;
			case "3":
				fileEdit();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다");
				return ;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
		
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.print("파일에 저장할 내용을 입력하세요.\r\n"
					+ "ex끝it  이라고 입력하면 종료됩니다.\r\n"
					+ "내용 : ");
			String str = sc.nextLine();
			if ("ex끝it".equals(str)) break;
			sb.append(str).append('\n');
		}
		
		System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
		String file = sc.nextLine();
		File f = new File(file);
		if (f.exists()) {
			System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
			String ans = sc.nextLine();
			if ("n".equalsIgnoreCase(ans)) return ;
		}
		
		try {
			fc.fileSave(file, sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			try {
				StringBuilder sb = fc.fileOpen(file);
				System.out.println(sb);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			StringBuilder sb = new StringBuilder();
			while (true) {
				System.out.print("파일에 저장할 내용을 입력하세요. \r\n"
						+ "ex끝it  이라고 입력하면 종료됩니다. \r\n"
						+ "내용 : ");
				String str = sc.nextLine();
				if ("ex끝it".equals(str)) break;
				sb.append(str).append('\n');
			}
			
			try {
				fc.fileEdit(file, sb);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
