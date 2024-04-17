package masai._4four;
import java.util.*;
public class Library {

    private Set<String> libraryMembers;           
    private LinkedHashSet<String> borrowedBooks;  
    private TreeSet<String> sortedBookTitles;   
    private Map<String, String> bookDetails;       
    private LinkedHashMap<String, String> checkoutOrder; 
    private TreeMap<String, String> sortedBooksById; 
    
    private List<String> books;
    private LinkedList<String> waitingQueue;
    private Stack<String> returnedBooksLog;

    public Library() {
        this.libraryMembers = new HashSet<>();
        this.borrowedBooks = new LinkedHashSet<>();
        this.sortedBookTitles = new TreeSet<>();
        this.bookDetails = new HashMap<>();
        this.checkoutOrder = new LinkedHashMap<>();
        this.sortedBooksById = new TreeMap<>();
        
        this.books = new ArrayList<>();
        this.waitingQueue = new LinkedList<>();
        this.returnedBooksLog = new Stack<>();

        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        
        bookDetails.put("Book1", "Author1");
        bookDetails.put("Book2", "Author2");
        bookDetails.put("Book3", "Author3");
    }

    public void checkoutBook(String bookTitle, String userName, String bookId) {
        try {
            if (books.contains(bookTitle)) {
                books.remove(bookTitle);
                borrowedBooks.add(bookTitle);
                sortedBookTitles.add(bookTitle);
                libraryMembers.add(userName);
                checkoutOrder.put(bookTitle, userName);
                sortedBooksById.put(bookId, bookTitle);
                System.out.println("'" + bookTitle + "' has been checked out by " + userName + ".");
            } else {
                addToWaitingQueue(userName);
                throw new BookNotAvailableException(bookTitle);
            }
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using the library!");
        }
    }

    public void returnBook(String bookTitle, String bookId) {
        books.add(bookTitle);
        borrowedBooks.remove(bookTitle);
        sortedBookTitles.remove(bookTitle);
        sortedBooksById.remove(bookId);
        System.out.println("'" + bookTitle + "' has been returned.");
    }

    private void addToWaitingQueue(String userName) {
        waitingQueue.offer(userName); 
        System.out.println(userName + " has been added to the waiting list.");
    }

    public void displayAvailableBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void displayBorrowedBooks() {
        for (String book : borrowedBooks) {
            System.out.println(book);
        }
    }

    public void displaySortedBookTitles() {
        for (String book : sortedBookTitles) {
            System.out.println(book);
        }
    }

    public void displayCheckoutOrder() {
        for (Map.Entry<String, String> entry : checkoutOrder.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", User: " + entry.getValue());
        }
    }

    public void displaySortedBooksById() {
        for (Map.Entry<String, String> entry : sortedBooksById.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Book: " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        Library lb = new Library();
        
        lb.displayAvailableBooks();

        lb.checkoutBook("Book1", "User1", "1");
        lb.checkoutBook("Book2", "User2", "2");
        lb.checkoutBook("Book4", "User3", "3"); 

        lb.displayAvailableBooks();

        lb.displayBorrowedBooks();

        lb.displaySortedBookTitles();

        lb.displayCheckoutOrder();

        lb.displaySortedBooksById();

        lb.returnBook("Book1", "1");
        lb.returnBook("Book2", "2");

        lb.displayAvailableBooks();
    }

	
}
