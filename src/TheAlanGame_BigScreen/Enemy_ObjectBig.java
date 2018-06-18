package TheAlanGame_BigScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Enemy_ObjectBig extends JFrame {
    public int x = 1240;
    public int y = 1600;
    public int dx;
    public int dy;
    private Image image;
    protected JPanel panel;
    ImageIcon a = new ImageIcon("Photos4Game/ColeHead1.png");
    public Rectangle rectangle;



    public Enemy_ObjectBig() {
        loadImage();
    }

    public void move() {
        x += dx;
        rectangle.x += dx;
        y += dy;
        rectangle.y += dy;
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        if (x > 1445) {
            x = 1445;
        }
        if (y > 539) {
            y = 539;
        }
    }

    public void loadImage() {
        image = a.getImage();
        int w = a.getIconWidth();
        int h = a.getIconHeight();
        rectangle = new Rectangle(x, y, w, h);

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

    public void keyPressed(KeyEvent i) {
        int key = i.getKeyCode();

        if (key == KeyEvent.VK_L) {
            dx = 6;
        }
        if (key == KeyEvent.VK_J) {
            dx = -6;
        }
        if (key == KeyEvent.VK_I) {
            dy = -2;
        }
    }

    public void keyReleased(KeyEvent i) {
        int key = i.getKeyCode();

        if (key == KeyEvent.VK_L) {
            dx = 0;
        }
        if (key == KeyEvent.VK_J) {
            dx = 0;
        }
        if (key == KeyEvent.VK_I) {
            dy = 4;
        }
    }
}
