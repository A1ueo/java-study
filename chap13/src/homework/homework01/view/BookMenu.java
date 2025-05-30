package homework.homework01.view;

import java.util.List;
import java.util.Scanner;

import homework.homework01.controller.BookController;
import homework.homework01.model.vo.Book;

public class BookMenu {
private Scanner sc = new Scanner(System.in);
private BookController bookController = new BookController();

public void mainMenu() {
	System.out.print(
			"=== 가남 도서관에 오신걸 환영합니다 ===\n"
			+ "원하시는 업무의 번호를 선택하세요.\n"
			+ "1. 새 도서 추가\n"
			+ "2. 도서 전체 조회\n"
			+ "3. 도서 검색 조회\n"
			+ "4. 도서 삭제\n"
			+ "5. 도서 오름차순 정렬\n"
			+ "9. 종료\n");
	int inputNum;
	boolean flag = true;
	while(flag) {
		System.out.print("메뉴 선택: ");
		inputNum = sc.nextInt();
		sc.nextLine();
		if(!(inputNum >= 1 && inputNum <= 5 || inputNum == 9)) {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			continue;
		}
		
		switch (inputNum) {
			case 1 -> {
				insertBook();
				continue;
			}
			case 2 -> {
				selectList();
				continue;
			}
			case 3 -> {
				searchBook();
				continue;
			}
			case 4 -> {
				deleteBook();
				continue;
			}
			case 5 -> {
				ascBook();
				continue;
			}
			case 9 -> {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			}
		}
	}
	
}

public void insertBook() {
	System.out.println("=== 도서 등록 ===");
	
	System.out.print("도서명: ");
	String title = sc.nextLine();
	System.out.print("저자명: ");
	String autor = sc.nextLine();
	System.out.print("장르: ");
	int categoryNum = sc.nextInt();
	System.out.print("가격: ");
	int price = sc.nextInt();
	sc.nextLine();
	
	String category;
	switch (categoryNum) {
	case 1 -> category = "인문";
	case 2 -> category = "자연과학";
	case 3 -> category = "어린이";
	default -> category = "기타";
	}
	
	Book newBook = new Book(title, autor, category, price);
	bookController.insertBook(newBook);
}

public void selectList() {
	System.out.println("=== 전체 조회 ===");
	
	List<Book> bookList = bookController.selectList();
	if(bookList.isEmpty()) System.out.println("존재하는 도서가 없습니다.");
	else {
		for(Book b : bookList)
			System.out.println(b);
	}
}

public void searchBook() {
	System.out.println("=== 도서 검색 ===");
	System.out.print("검색어: ");
	String keyword = sc.nextLine();
	List<Book> searchList = bookController.searchBook(keyword);
	
	if(searchList.isEmpty()) System.out.println("검색 결과가 없습니다.");
	else {
		for(Book b : searchList)
			System.out.println(b);
	}
}

public void deleteBook() {
	System.out.println("=== 도서 삭제 ===");
	System.out.print("도서명: ");
	String title = sc.nextLine();
	System.out.print("저자명: ");
	String author = sc.nextLine();
	
	Book remove = bookController.deleteBook(title, author);
	if(remove != null) System.out.println("성공적으로 삭제되었습니다.");
	else System.out.println("삭제할 도서를 찾지 못했습니다.");
	
}

public void ascBook() {
	int result = bookController.ascBook();
	if(result == 1) {
		System.out.println("정렬에 성공하였습니다.");
		selectList();
	}
	else System.out.println("정렬에 실패하였습니다.");
}

}
