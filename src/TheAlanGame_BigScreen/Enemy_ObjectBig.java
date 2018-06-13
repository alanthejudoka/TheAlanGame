package TheAlanGame_BigScreen;

import javax.swing.*;
import java.awt.*;

public class Enemy_ObjectBig extends JFrame{
    private int x = 600;
    private int y = 1140;
    private int dx;
    private int dy;
    private Image image;
    private int w;
    private int h;

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
        if (x > 1369){
            x = 1369;
        }
        if (y > 450){
            y = 450;
        }
    }
    public void loadImage() {
        ImageIcon x = new ImageIcon("Photos4Game/Cole1.png");
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
}
