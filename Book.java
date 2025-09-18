public class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        super(title); // Call the constructor of LibraryItem
        this.author = author;
        this.isbn = isbn;
    }
    
    // Override to add book-specific details
    @Override
    public void displayDetails() {
        System.out.println("--- Book Details ---");
        super.displayDetails(); // Call parent method
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}