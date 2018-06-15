package TheAlanGame_BigScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Enemy_ObjectBig extends JFrame{
    private int x = 1240;
    private int y = 1600;
    public int dx;
    public int dy;
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
