package masai._2two;

public class BookNotAvailableException extends Exception {
	
    public BookNotAvailableException(String bookTitle) {
        super("The book "+ bookTitle +" is not available for checkout.");
    }
    
    public BookNotAvailableException() {
		
	}

}
