package com._9_ninth;

public class ResourceManager {
	   public static void main(String[] args) {
	        Book book = new Book("Atomic Habits", "James Clear");
	        Journal journal = new Journal("Atomic Habits Monthly", 12);
	    
	        System.out.println("Searching for 'Atomic Habits':");
	        System.out.println("Book: " + book.search("Atomic Habits"));
	        System.out.println("Journal: " + journal.search("Atomic Habits"));
	
	        book.checkOut();
	        journal.checkOut();

	        book.returnResource();
	        journal.returnResource();
	    }
}
