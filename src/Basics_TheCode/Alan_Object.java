package Basics_TheCode;

import java.awt.*;

public class Alan_Object {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image image;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getDx() {
        return dx;
    }
    public int getDy() {
        return dy;
    }
    public Image getImage() {
        return image;
    }
    public void move(){
        x += dx;
        y += dy;
    }

}
