import java.util.UUID;

public class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isCheckedOut;

    public LibraryItem(String title) {
        this.title = title;
        // Generate a unique ID for each library item
        this.itemId = UUID.randomUUID().toString().substring(0, 8);
        this.isCheckedOut = false;
    }

    public void checkOut() {
        this.isCheckedOut = true;
        System.out.println(title + " has been checked out.");
    }

    public void returnItem() {
        this.isCheckedOut = false;
        System.out.println(title + " has been returned.");
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Status: " + (isCheckedOut ? "Checked Out" : "Available"));
    }
}