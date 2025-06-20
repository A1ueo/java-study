package com.gn.model.vo;
public class Poem extends Book {

	public Poem() {
	}

	public Poem(String isbn, int price) {
		super(isbn, price);
	}

	@Override
	public void printInfo() {
		System.out.print("[시] ");
		super.printInfo();
	}


}
