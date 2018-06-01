package Basics_TheCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Alan_Object {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image image;
    private int w;
    private int h;

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
    public int getWidth(){
        return w;
    }
    public int getHeight(){
        return h;
    }
    public Image getImage() {
        return image;
    }
    public void loadImage() {
        ImageIcon x = new ImageIcon("Photos4Game/RealAlan1.jpg");
        image = x.getImage();
    }
    public void move(){
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent i){
        int key = i.getKeyCode();

        if (key == KeyEvent.VK_RIGHT){
            dx += 4;
        }
        if (key == KeyEvent.VK_LEFT){
            dx -= 4;
        }
    }

    public void keyReleased(KeyEvent i){
        int key = i.getKeyCode();

        if (key == KeyEvent.VK_RIGHT){
            dx = 0;
        }
        if (key == KeyEvent.VK_LEFT){
            dx = 0;
        }
    }
}
