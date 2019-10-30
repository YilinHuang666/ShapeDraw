import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends JPanel{
    private Frame f;
    private Point p_cir = new Point(130,130);
    private Point p_rec = new Point(150,150);
    private Point p_squa = new Point(200,200);
    private Color c_cir=new Color(0x992266);
    private Color c_rec=new Color(0x99226);
    private Circle circle = new Circle(p_cir,c_cir,60);
    private Rect rectangle = new Rect(p_rec,c_rec,20,30);
    private Square square = new Square(p_squa,c_rec,20,20);
    private ArrayList<Shape> shapes = new ArrayList<Shape>();


    public Drawing(){
        setupFrame();
        setupCanvas();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(square);

    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400);
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }


    @Override
    public void paint(Graphics g){
        shapes.get(0).drawout(g);
        shapes.get(1).drawout(g);
        shapes.get(2).drawout(g);
    }
}
