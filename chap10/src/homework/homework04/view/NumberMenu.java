package homework.homework04.view;

import java.util.Scanner;

import homework.homework04.controller.NumberController;
import homework.homework04.exception.NumRangeException;

public class NumberMenu {
	Scanner sc;
	NumberController nc;
	
	public NumberMenu() {
		sc = new Scanner(System.in);
		nc = new NumberController();
	}
	
	public void menu() {
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		try {
			boolean check = nc.checkDouble(num1, num2);
			System.out.print(num1 + "은(는) " + num2 +"의 배수인가? " + check);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		
	}
}
