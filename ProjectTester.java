public class ProjectTester {
    public static void main(String[] args) {
        System.out.println("=== Library Management System Test ===\n");

        // Create a Book instance
        Book aGameOfThrones = new Book("A Game of Thrones", "George R.R. Martin", "978-0553103540");
        aGameOfThrones.displayDetails();
        System.out.println();
        
        // Create a Magazine instance
        Magazine natGeo = new Magazine("National Geographic", 245, "September 2025");
        natGeo.displayDetails();
        System.out.println();
        
        // Create a DVD instance
        DVD interstellar = new DVD("Interstellar", "Christopher Nolan", 169);
        interstellar.displayDetails();
        System.out.println("\n...Simulating checkout and return...\n");
        
        // Test the methods
        interstellar.checkOut();
        System.out.println();
        interstellar.displayDetails();
        System.out.println();
        interstellar.returnItem();
        System.out.println();
        interstellar.displayDetails();
    }
}