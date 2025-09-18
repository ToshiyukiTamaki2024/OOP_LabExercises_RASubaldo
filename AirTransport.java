public class AirTransport extends Transportation {
    private int maxAltitude; // in feet

    public AirTransport(String name, int capacity, double speed, int maxAltitude) {
        // Call the constructor of the parent class (Transportation)
        super(name, capacity, speed);
        this.maxAltitude = maxAltitude;
    }

    // Overriding the parent's method to be more specific
    @Override
    public void move() {
        System.out.println(name + " is flying through the air.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo first
        System.out.println("Max Altitude: " + maxAltitude + " ft");
    }
}
