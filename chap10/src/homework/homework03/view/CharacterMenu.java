package homework.homework03.view;

import java.util.Scanner;

import homework.homework03.controller.CharacterController;
import homework.homework03.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc;
	CharacterController cc;
	
	public CharacterMenu() {
		sc = new Scanner(System.in);
		cc = new CharacterController();
	}

	public void menu() {
		
		String str = sc.nextLine();
		try {
			int countAlpha = cc.countAlpha(str);
			System.out.println("\'"+str+"\'에 포함된 영문자 개수: " + countAlpha);
		} catch (CharCheckException e) {
			e.printStackTrace();
			
		}
	}
}
