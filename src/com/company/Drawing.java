package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;

    public Drawing(){
        setupFrame();
        setupCanvas();
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
        Point p_cir=new Point(200,200);
        Point p_rec=new Point(100,100);
        Color c_cir=new Color(0x992266);
        Color c_rec=new Color(0x99226);
        Circle cir = new Circle(p_cir,c_cir,100);
        cir.draw(g);
        Rect rec = new Rect(p_rec,c_rec,100,50);
        rec.draw(g);
    }
}
