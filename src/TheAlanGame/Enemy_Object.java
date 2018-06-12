package TheAlanGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Enemy_Object extends JFrame{
    private int x = 600;
    private int y = 1140;
    private int dx;
    private int dy;
    private Image image;
    private int w;
    private int h;

    public Enemy_Object(){
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
    public void keyPressed(KeyEvent i){
        int key = i.getKeyCode();

        if (key == KeyEvent.VK_RIGHT){
            dx = 6;
        }
        if (key == KeyEvent.VK_LEFT){
            dx = -6;
        }
        if (key == KeyEvent.VK_UP) {
            dy = -2;
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
            dy = 4;
        }
    }
}
