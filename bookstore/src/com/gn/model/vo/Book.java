package com.gn.model.vo;

import java.util.List;

public class Book {
	private  String isbn;
	private int price;

	public Book() {
	}

	public Book(String isbn, int price) {
		this.isbn = isbn;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}

	public void printInfo() {
		System.out.println("ISBN : " + isbn + ", 가격 :" + price + "원");
	}

	public void recoverMissingDigit() {
		char[] arr = isbn.toCharArray();
		int sum = 0, errIdx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '*') errIdx = i;
			else {
				if (i % 2 != 0) sum += (arr[i] - '0') * 3;
				else sum += arr[i] - '0';
			}
		}
		
		if (errIdx == -1) return ;
		
		int answer = 10 - sum % 10;
		if (errIdx % 2 != 0) {
			while (answer % 3 != 0)
				answer += 10;
			answer /= 3;
		}
		arr[errIdx] = (char) ('0' + answer);
		
		isbn = String.valueOf(arr);
	}
}
