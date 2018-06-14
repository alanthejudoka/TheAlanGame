package TheAlanGame_BigScreen;

import javax.swing.*;
import java.awt.*;

public class Enemy_ObjectBig extends JFrame{
    private int x = 1240;
    private int y = 1600;
    private int dx;
    private int dy;
    private Image image;
    private int w;
    private int h;
    protected JPanel panel;

    public Enemy_ObjectBig(){
        loadImage();
    }
    public void move(){
        x += dx;
        y += dy;
        if (x < 0){
            x = 0;
        }
        if (y < 0){
            y = 0;
        }
        if (x > 1445){
            x = 1445;
        }
        if (y > 539){
            y = 539;
        }
    }
    public void loadImage() {
        ImageIcon x = new ImageIcon("Photos4Game/ColeHead1.png");
        image = x.getImage();
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Image getImage() {
        return image;
    }

    public void movement() {
        x += dx;
        y += dy;

        if ((getLeft() < 0) || (getRight() > panel.getWidth())) {
            dx *= -1;
        }
        if ((getTop() < 0) || (getBottom() > panel.getHeight())) {
            dy *= -1;
        }
    }

    public int getRight(){
        return x + dx;
    }
    public int getLeft() {
        return x - dx;
    }
    public int getTop() {
        return y - dy;
    }
    public int getBottom() {
        return y + dy;
    }
}
