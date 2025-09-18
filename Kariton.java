public class Kariton extends LandTransport {
    public Kariton() {
        // A Kariton has fixed properties
        super("Kariton (Pushcart)", 1, 3.0, 2);
    }
    
    @Override
    public void move() {
        System.out.println(name + " is being pushed slowly.");
    }
}