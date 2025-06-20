package com.gn.controller;

import com.gn.model.dao.BookDAO;
import com.gn.model.vo.Book;
import com.gn.model.vo.Novel;
import com.gn.model.vo.Poem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookController {
	List<Book> list = new ArrayList<>();
	private BookDAO bookDAO = new BookDAO();

	public List<Book> input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 책 정보 입력 ====");
		Set<String> validTypes = new HashSet<>() {{
			add("소설");
			add("시");
		}};

		boolean flag = true;
		while (flag) {
			String book_type;
			while (true){
				System.out.print("책 종류를 입력하세요: ");
				book_type = sc.nextLine().trim();
				if (validTypes.contains(book_type)) break;
				else System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
			}
			
			String isbn;
			int isbnValidation;
			while (true) {
				System.out.print("ISBN을 입력하세요 (13자리, * 포함 가능): ");
				isbn = sc.nextLine().trim();
				isbnValidation = isValidISBN(isbn);
				if (isbnValidation == -1) System.out.println("유효하지 않은 ISBN입니다.");
				else break;
			}
			
			int price;
			while (true) {
				try {
					System.out.print("가격을 입력하세요: ");
					price = sc.nextInt();
					sc.nextLine();
					break;
				} catch (NumberFormatException e) {
					System.out.println("잘못 입력하였습니다.");
				}
			}
			
			Book book = null;

			if ("소설".equals(book_type)) book = new Novel(isbn, price);
			else if ("시".equals(book_type)) book = new Poem(isbn, price);
			if (isbnValidation == 1) book.recoverMissingDigit();
			
			int result = bookDAO.insert(book);
			if (result > 0) {
				System.out.println("데이터 등록 성공!");
				list.add(book);
			}
			else System.out.println("데이터 등록 실패!");
			

			while (true) {
				System.out.print("입력을 종료하시겠습니까? (Y/N): ");
				String quit = sc.nextLine().trim();
				if ("y".equalsIgnoreCase(quit)) {
					flag = false;
					break;
				}
				else if ("n".equalsIgnoreCase(quit)) break;
				else System.out.println("잘못 입력하셨습니다.");
			}
		}

		return list;
	}
	
	public int isValidISBN(String isbn) {
		if (isbn.length() != 13) return -1;
		
		char[] arr = isbn.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '*') {
				count++;
				if (count > 1) return -1;
			}
		}
		if (count == 1) return 1;
		
		return 0;
	}

	public double avgPrice() {
		int sum = 0;
		for (Book book : list) {
			sum += book.getPrice();
		}

		double result = (double) sum / list.size();
		result = (double) Math.round(result * 100) / 100;

		return result;
	} 
}
