package homework.homework02.view;

import java.util.Scanner;

import homework.homework02.controller.LotteryController;
import homework.homework02.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		
		boolean flag = true;
		while (flag) {
			System.out.print("\n===== 로또 번호 추첨 =====\r\n"
					+ "1. 추첨 대상 추가\r\n"
					+ "2. 추첨 대상 삭제\r\n"
					+ "3. 추첨 대상 목록 조회\r\n"
					+ "4. 당첨 대상 구성\r\n"
					+ "5. 정렬된 당첨 대상 확인\r\n"
					+ "6. 당첨 대상 검색\r\n"
					+ "9. 종료\r\n"
					+ "메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				insertObjcet();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				searchObject();
				break;
			case 4:
				winObject();
				break;
			case 5:
				sortedWinObject();
				break;
			case 6:
				searchWinner();
				break;
			case 9:
				flag = false;
				break;

			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
		
		System.out.println("프로그램 종료.");
	}
	
	public void insertObjcet() {
		System.out.print("\n===== 1. 추첨 대상 추가 =====\r\n"
				+ "추가할 추첨 대상 수 : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int count = 0;
		while(count < n) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("휴대폰 번호(-빼고): ");
			String phone = sc.nextLine();
			
			Lottery newLottery = new Lottery(name, phone);
			if(lc.searchWinner(newLottery)) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				continue;
			}
			lc.insertObject(newLottery);
			count++;
		}
		System.out.println(n + "명 추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		System.out.print("\n===== 2. 추첨 대상 삭제 =====\r\n"
				+ "삭제할 대상의 이름과 핸드폰 번호를 입력하세요.\r\n");

		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("휴대폰 번호(-빼고): ");
		String phone = sc.nextLine();

		Lottery deleteLottery = new Lottery(name, phone);
		if(lc.deleteObject(deleteLottery)) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void searchObject() {
		System.out.println("\n===== 3. 추첨 대상 목록 조회 =====");
		System.out.println(lc.searchObject());
	}
	
	public void winObject() {
		System.out.println("\n===== 4. 당첨 대상 구성 =====");
		if(lc.winObject() == null)
			System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
		else System.out.println(lc.winObject());
	}
	
	public void sortedWinObject() {
		System.out.println("\n===== 5. 정렬된 당첨 대상 확인 =====");
		var it = lc.sortedWinObject().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public void searchWinner() {
		System.out.println("\n===== 6. 당첨 대상 검색 =====\r\n"
				+ "검색할 대상의 이름과 핸드폰 번호를 입력하세요.");

		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("휴대폰 번호(-빼고): ");
		String phone = sc.nextLine();
		
		Lottery searchWinner = new Lottery(name, phone);
		if(lc.searchWinner(searchWinner))
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		else
			System.out.println("다음 기회에!");
		
	}
	
}
