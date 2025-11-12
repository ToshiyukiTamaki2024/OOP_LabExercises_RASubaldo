import javax.swing.SwingUtilities;

/**
 * GameTester.java
 * This class contains the main method to run the Arithmetic Game.
 * It ensures the GUI is created on the Event Dispatch Thread (EDT).
 */
public class GameTester {

    public static void main(String[] args) {
        
        // Use SwingUtilities.invokeLater to create and show the GUI
        // This is the standard and safest way to start a Swing application.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of our game window
                new ArithmeticGame();
            }
        });
    }
}