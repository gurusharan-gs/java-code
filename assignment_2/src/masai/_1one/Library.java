package masai._1one;

import java.util.*;

public class Library {

    private List<String> books = new ArrayList<>();

    public Library() {
    	books.add("Book1");
    	books.add("Book2");
    	books.add("Book3");
    }

    public void checkoutBook(String bookTitle) throws BookNotAvailableException {
        if (books.contains(bookTitle)) {
        	books.remove(bookTitle);
            System.out.println(" + bookTitle + is checked out.");
        } else {
            throw new BookNotAvailableException(bookTitle);
        }
        
    }
    
    public static void main(String[] args) {
        Library lb = new Library();

        try {
            lb.checkoutBook("Book1");
            lb.checkoutBook("Book4"); 
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
