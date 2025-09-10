public class CarTester {

    public static void main(String[] args) {
        
        // Array holding the ten car names
        String[] carBrands = {
            "Toyota", "Ford", "Honda", "Volkswagen", "Hyundai",
            "Tesla", "Nissan", "Chevrolet", "Mercedes-Benz", "Kia"
        };
        
        System.out.println("Creating Car Objects...\n");

        // Loop through the array of car brands
        for (String brand : carBrands) {
            // For each brand, create a new Car object.
            // We are using placeholder data for color, plate, and chassis numbers.
            Car myCar = new Car(brand, "Black", "ABC-123", "XYZ-789");
            
            // Display the information for the newly created car
            myCar.displayInfo();
        }
    }
}