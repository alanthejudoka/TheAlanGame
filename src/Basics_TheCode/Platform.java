package Basics_TheCode;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
public class Platform extends JFrame {
    public Platform() {
        setTitle("The Alan Game");
        add(new Platforming());
        //add(new Alan_Object());

    }

    public static void main(String[] args) throws IOException {
        Platform frame = new Platform();
        frame.setSize(1400, 1400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    class Platforming extends JPanel {
        public final Color Brown = new Color(139, 69, 19);
        int x = 0, y = 0, velX = 0, velY = 0;

        public Platforming() {
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
        }

        protected void paintComponent(Graphics g) {
            int w = getWidth();
            int h = getHeight();

            //atmosphere
            g.setColor(Color.ORANGE);
            g.fillRect(0, 0, w, h);


            g.setColor(Brown);
            g.fillRect(0, 800, w, 600);
        }
    }
}
