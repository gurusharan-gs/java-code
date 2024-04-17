package masai._2two;
import java.util.*;
public class Library {
	
    private List<String> books = new ArrayList<>();

    public Library() {
    	books.add("Book1");
    	books.add("Book2");
    	books.add("Book3");
    }

    public void checkoutBook(String bookTitle) {
        try {
            if (books.contains(bookTitle)) {
            
                System.out.println("bookTitle is checked out.");
            } else {
                throw new BookNotAvailableException(bookTitle);
            }
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using the library!");
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.checkoutBook("Book1");     
        library.checkoutBook("Book4");    
    }

}
