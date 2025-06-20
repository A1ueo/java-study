package com.gn.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gn.model.vo.Book;

public class BookDAO extends JDBConnection{
	public int insert(Book book) {
		int result = 0;
		
		String sql = "INSERT INTO book (isbn, type, price) "
				+ "VALUES (?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getIsbn());
			String bookType = book.getClass().getSimpleName();
			psmt.setString(2, bookType);
			psmt.setInt(3, book.getPrice());
			
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 등록 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
}
