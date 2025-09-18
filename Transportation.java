public class Transportation {
    // Common properties for all transportation types
    protected String name;
    protected int capacity;
    protected double speed; // in km/h

    // Constructor to initialize the properties
    public Transportation(String name, int capacity, double speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    // A general method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity + " people");
        System.out.println("Speed: " + speed + " km/h");
    }

    // A general method for movement
    public void move() {
        System.out.println("The transportation is moving.");
    }
}
