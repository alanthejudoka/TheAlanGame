

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColeWantsToLearn extends JFrame{
    private ColeWantsToLearn() {
        setTitle("The Alan Game");
        add(new Platforming());
    }
    public static void main(String[] args) {
        ColeWantsToLearn frame = new ColeWantsToLearn();
        frame.setSize(1400, 1400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
class Platforming extends JPanel implements ActionListener, KeyListener {
    Timer tm = new Timer(5, this);
    public static final Color Brown = new Color(139, 69, 19);
    int x=0, y=0, velX=0, velY=0;

    public Platforming(){
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    protected void paintComponent (Graphics g) {
        int w = getWidth();
        int h = getHeight();

        //atmosphere
        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, w, h);

        //ground
        g.setColor(Brown);
        g.fillRect(0, 800, w, 600);

        //Alan
        g.setColor(Color.GREEN);
        g.fillRect(x, 800, 60, 100);

        //everyone else
        g.setColor(Color.RED);
        g.fillRect(w-200, 700, 60, 100);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + velX;
        y = y + velY;
        repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_LEFT){
            velX = -8;
        }
        else if (c == KeyEvent.VK_UP){
            velY = -8;
        }
        else if (c == KeyEvent.VK_RIGHT){
            velX = 8;
        }
        else if (c == KeyEvent.VK_DOWN){
            velY = 8;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT){
            velX = 0;
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN){
            velY = 0;
        }
    }
}