public class WaterTransport extends Transportation {
    private String propulsionType; // e.g., "Sail", "Engine"

    public WaterTransport(String name, int capacity, double speed, String propulsionType) {
        super(name, capacity, speed);
        this.propulsionType = propulsionType;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving on water.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Propulsion: " + propulsionType);
    }
}