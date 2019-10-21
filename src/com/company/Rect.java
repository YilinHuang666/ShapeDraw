package com.company;

import java.awt.*;

public class Rect {
    private int width;
    private int height;// Fields
    private Point pos;
    private Color col;
    public Rect(Point initPos, Color col, int width, int height){
        this.width = width;
        this.height = height;
        pos = initPos;
        this.col = col;
    }

    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }
}
