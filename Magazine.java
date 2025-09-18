public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationDate;

    public Magazine(String title, int issueNumber, String publicationDate) {
        super(title);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("--- Magazine Details ---");
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Publication Date: " + publicationDate);
    }
}