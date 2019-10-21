package shapes;

import java.awt.*;

public class Rect extends Shape{
    private int width;
    private int height;// Fields
    public Rect(Point initPos, Color col,int width, int height){
        super(initPos,col);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }

}
