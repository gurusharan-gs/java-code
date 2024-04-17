package masai._3three;
import java.util.*;
public class Library {
	
    
    private List<String> books;
    private LinkedList<String> waitingQueue;
    private Vector<String> membersList;
    private Stack<String> returnedBooksLog;

    public Library() {
        this.books = new ArrayList<>();
        this.waitingQueue = new LinkedList<>();
        this.membersList = new Vector<>();
        this.returnedBooksLog = new Stack<>();
        
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
    }

    public void checkoutBook(String bookTitle, String userName) {
        try {
            if (books.contains(bookTitle)) {
            	books.remove(bookTitle);
                System.out.println(bookTitle +" is checked out by " + userName + ".");
                membersList.add(userName);
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

    public void returnBook(String bookTitle) {
    	books.add(bookTitle);
        returnedBooksLog.push(bookTitle);
        System.out.println(bookTitle + " has been returned.");
    }

    private void addToWaitingQueue(String userName) {
        waitingQueue.offer(userName); 
        System.out.println(userName + " has been added to the waiting list.");
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void displayWaitingQueue() {
        System.out.println("Waiting Queue:");
        for (String user : waitingQueue) {
            System.out.println(user);
        }
    }

    public void displayMembersList() {
        System.out.println("Members List:");
        for (String member : membersList) {
            System.out.println(member);
        }
    }

    public void displayReturnedBooksLog() {
        System.out.println("Returned Books Log:");
        while (!returnedBooksLog.isEmpty()) {
            System.out.println(returnedBooksLog.pop());
        }
    }
    
    public static void main(String[] args) {
        Library lb = new Library();

      
        lb.displayAvailableBooks();

        
        lb.checkoutBook("Book1", "User1");  
        lb.checkoutBook("Book4", "User2");  

        lb.displayAvailableBooks();

        lb.displayWaitingQueue();

        lb.returnBook("Book1");
        lb.returnBook("Book3");

        lb.displayReturnedBooksLog();

        lb.displayMembersList();
    }

    
  
}
