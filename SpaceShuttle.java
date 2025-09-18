public class SpaceShuttle extends AirTransport {
    public SpaceShuttle(String name, int capacity, double speed, int maxAltitude) {
        super(name, capacity, speed, maxAltitude);
    }
    
    @Override
    public void move() {
        System.out.println(name + " is launching into space!");
    }
}