package com.gn;

import com.gn.controller.BookController;
import com.gn.model.vo.*;
import java.util.List;

public class BookStoreApplication {
	public static void main(String[] args) {
		BookController bc = new BookController();
		// List<Book> list = new ArrayList<>();
		// list.add(new Novel("97*8937460449", 14000));
		// list.add(new Poem("9791193937655", 9000));
		// list.add(new Novel("97889*7461798", 15000));

		List<Book> list = bc.input();
		
		System.out.println("\n===== 도서 목록 =====");

		for (Book book : list)
			book.printInfo();
		
		double average = bc.avgPrice();
		System.out.println("\n총 평균 가격: " + average + "원");
	}
}
