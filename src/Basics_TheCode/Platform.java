package Basics_TheCode;

import javax.swing.*;
import java.awt.*;

public class Platform extends JFrame{
    private Platform() {
        setTitle("The Alan Game");
        add(new Platforming());
    }
    public static void main(String[] args) {
        Platform frame = new Platform();
        frame.setSize(1400, 1400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
class Platforming extends JPanel {
    @Override
    protected void paintComponent (Graphics g) {
        int w = getWidth();
        int h = getHeight();

        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, w, h);

        //g.setColor(Color.GREEN);
        //g.fillRect(0, );
    }
}