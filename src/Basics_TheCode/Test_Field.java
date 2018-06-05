package Basics_TheCode;

import org.omg.PortableInterceptor.ACTIVE;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Test_Field extends JPanel implements ActionListener{
    private Timer timer;
    private Alan_Object spaceShip;
    private final int DELAY = 10;

    public Test_Field() {

        initBoard();
    }

    private void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.black);
        setDoubleBuffered(true);
        spaceShip = new Alan_Object();
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(spaceShip.getImage(), spaceShip.getX(),
                spaceShip.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        step();
    }

    private void step() {
        spaceShip.move();
        repaint();
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            spaceShip.keyReleased(e);
        }
        @Override
        public void keyPressed(KeyEvent e) {
            spaceShip.keyPressed(e);
        }
    }
}
