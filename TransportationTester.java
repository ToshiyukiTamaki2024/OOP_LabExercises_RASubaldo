public class TransportationTester {
    public static void main(String[] args) {
        System.out.println("--- Testing Transportation Hierarchy ---\n");

        // Air Transport
        Airplane boeing747 = new Airplane("Boeing 747", 416, 988, 35000);
        boeing747.displayInfo();
        boeing747.move();
        System.out.println("--------------------");

        Helicopter apache = new Helicopter("Apache Helicopter", 2, 293, 20000);
        apache.displayInfo();
        apache.move();
        System.out.println("--------------------");

        SpaceShuttle discovery = new SpaceShuttle("Discovery Shuttle", 7, 28000, 530000);
        discovery.displayInfo();
        discovery.move();
        System.out.println("\n--- Land Transport ---\n");

        // Land Transport
        Truck semiTruck = new Truck("Semi-Truck", 2, 100);
        semiTruck.displayInfo();
        semiTruck.move();
        System.out.println("--------------------");

        SUV fortuner = new SUV("Toyota Fortuner", 7, 180);
        fortuner.displayInfo();
        fortuner.move();
        System.out.println("--------------------");

        Tricycle bajaj = new Tricycle("Bajaj RE", 4, 60);
        bajaj.displayInfo();
        bajaj.move();
        System.out.println("--------------------");

        Motorcycle xsr155 = new Motorcycle("Yamaha XSR155", 2, 130);
        xsr155.displayInfo();
        xsr155.move();
        System.out.println("--------------------");
        
        Kariton pushcart = new Kariton();
        pushcart.displayInfo();
        pushcart.move();
        System.out.println("\n--- Water Transport ---\n");

        // Water Transport
        Boat speedBoat = new Boat("Speed Boat", 6, 90);
        speedBoat.displayInfo();
        speedBoat.move();
        System.out.println("--------------------");

        Submarine ohioClass = new Submarine("Ohio-class Submarine", 155, 46);
        ohioClass.displayInfo();
        ohioClass.move();
        System.out.println("--------------------");
    }
}