package com.gn.model.vo;
public class Novel extends Book {

	public Novel() {
	}

	public Novel(String isbn, int price) {
		super(isbn, price);
	}
	

	@Override
	public void printInfo() {
		System.out.print("[소설] ");
		super.printInfo();
	}


}
