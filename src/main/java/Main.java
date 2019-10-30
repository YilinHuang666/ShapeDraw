import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc; // Class field containing config info

    public static void main(String[] args) {
	    System.out.println("Hello,world!");
	    //Drawing d = new Drawing();
            JFrame frame= new JFrame(gc); // Create a new JFrame
            frame.setSize(700,500);
            frame.getContentPane().add(new Drawing());
            frame.getContentPane().add(new ButtonPanel());
            frame.setVisible(true);
            // This next line closes the program when the frame is closed
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
