public class LandTransport extends Transportation {
    private int numWheels;

    public LandTransport(String name, int capacity, double speed, int numWheels) {
        super(name, capacity, speed);
        this.numWheels = numWheels;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving on the ground.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numWheels);
    }
}