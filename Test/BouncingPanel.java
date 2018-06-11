package Unit10.Day13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BouncingPanel extends JPanel {
    public BouncingPanel() {
        super();
        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0; i<spriteList.size(); i++) {
                    Sprite s = spriteList.get(i);
                    s.move();
                }
                repaint();
            }
        });
        timer.start();
    }
    public void add(Sprite sprite) {
        spriteList.add(sprite);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=0; i<spriteList.size(); i++) {
            Sprite s = spriteList.get(i);
            s.paint(g);
        }
    }
}
