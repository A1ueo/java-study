package homework.homework03.view;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import homework.homework03.controller.MemberController;
import homework.homework03.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		boolean flag = true;
		while(flag) {
			System.out.print("\n===== (주)가남에 오신것을 환영합니다. =====\r\n"
					+ "원하시는 메뉴의 번호를 입력하세요.\r\n"
					+ "1. 회원가입\r\n"
					+ "2. 로그인\r\n"
					+ "3. 같은 이름 회원 찾기\r\n"
					+ "9. 종료\r\n"
					+ "메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				joinMember();
				break;
				
			case 2:
				login();
				memberMenu();
				break;
				
			case 3:
				sameName();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;

			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void memberMenu() {
		boolean flag = true;
		while (flag) {
			System.out.print("\n***** 회원 메뉴 *****\r\n"
					+ "회원 메뉴는 회원만 접근할 수 있습니다.\r\n"
					+ "먼저 회원가입, 로그인을 해주세요.\r\n"
					+ "1. 비밀번호 바꾸기\r\n"
					+ "2. 이름 바꾸기\r\n"
					+ "3. 로그아웃\r\n"
					+ "메뉴 번호 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				changePassword();
				break;

			case 2:
				changeName();
				break;

			case 3:
				System.out.println("로그아웃 되었습니다.");
				return;
				
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
			
		}
		
	}
	
	public void joinMember() {
		boolean flag = true;
		while (flag) {
			System.out.print("\n=== 1. 회원가입 ===\r\n"
					+ "아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			flag = !mc.joinMember(id, new Member(pw, name));
			if (flag) System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			else System.out.println("성공적으로 회원가입 완료하였습니다.");
		}
	}
	
	public void login() {
		while(true) {
			System.out.print("\n=== 2. 로그인 ===\r\n"
					+ "아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			String name = mc.logIn(id, pw);
			if(name == null) System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			else {
				System.out.println(name + "님, 환영합니다!");
				break;
			}
		}
	}
	
	public void changePassword() {
		boolean flag = true;
		while (flag) {
			System.out.print("\n=== 1. 비밀번호 바꾸기 ===\r\n"
					+ "아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();
			flag = !mc.changePassword(id, oldPw, newPw);
			if(flag) System.out.println("비밀번호가 다릅니다.");
			else System.out.println("비밀번호 변경에 성공했습니다.");
		}
	}
	
	public void changeName() {
		System.out.print("=== 2. 이름 바꾸기 ===\r\n"
				+ "아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		System.out.print("현재 설정된 이름 : " + mc.logIn(id, pw)
				+ "\r\n변경할 이름 : ");
		String newName = sc.nextLine();
		mc.changeName(id, newName);
		System.out.println("이름 변경에 성공했습니다.");
	}
	
	public void sameName() {
		System.out.print("\n=== 3. 같은 이름 회원 찾기 ===\r\n"
				+ "검색할 이름 : ");
		String name = sc.nextLine();
		Map<String, String> newMap = mc.sameName(name);
		Set<Map.Entry<String, String>> entrySet = newMap.entrySet();
		for(Map.Entry<String, String> entry : entrySet) {
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}
	}
}
