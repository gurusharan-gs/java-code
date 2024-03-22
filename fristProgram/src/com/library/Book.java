package com.library;

public class Book {
	
	static int totalBooks; 
	String title;
	String author;
	boolean isbn;
	
	public void borrowBook() {
		totalBooks++;
		
	}
	
	public void returnBook() {
		totalBooks--;
	}
	public static void getTotalBook() {
		totalBooks++;
	}

}
