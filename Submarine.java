public class Submarine extends WaterTransport {
    public Submarine(String name, int capacity, double speed) {
        super(name, capacity, speed, "Nuclear Reactor");
    }
    
    @Override
    public void move() {
        System.out.println(name + " is diving underwater.");
    }
}