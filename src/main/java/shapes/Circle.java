package shapes;

import java.awt.*;
/**
 * The shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */
public class Circle extends Shape implements draw{
    private int rad; // Fields
    public Circle(Point initPos, Color col, int radius){ // The constructor
        super(initPos,col);
        rad=radius; // Initialize fields


    }

    //@Override
    // A method that draws the object in g
    //public void draw(Graphics g) {

    //}


    @Override
    public void drawout(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad,rad);
    }
}