public class DVD extends LibraryItem {
    private String director;
    private int runtimeMinutes;

    public DVD(String title, String director, int runtimeMinutes) {
        super(title);
        this.director = director;
        this.runtimeMinutes = runtimeMinutes;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("--- DVD Details ---");
        super.displayDetails();
        System.out.println("Director: " + director);
        System.out.println("Runtime: " + runtimeMinutes + " minutes");
    }
}