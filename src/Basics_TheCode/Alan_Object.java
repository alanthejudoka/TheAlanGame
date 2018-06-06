package Basics_TheCode;

import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Alan_Object extends JFrame{
    private int x = 40;
    private int y = 60;
    private int dx;
    private int dy;
    private Image image;
    private int w;
    private int h;

    public Alan_Object(){
        loadImage();
    }
    public void move(){
        x += dx;
        y += dy;
    }
    public void loadImage() {
        ImageIcon x = new ImageIcon("Photos4Game/WeirdAl1.png");
        image = x.getImage();
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
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
    public void keyPressed(KeyEvent i){
        int key = i.getKeyCode();

        if (key == KeyEvent.VK_RIGHT){
            dx = 4;
        }
        if (key == KeyEvent.VK_LEFT){
            dx = -4;
        }
        if (key == KeyEvent.VK_UP) {
            dy = -4;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 4;
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
        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}