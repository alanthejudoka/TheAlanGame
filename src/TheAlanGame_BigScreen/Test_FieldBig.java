package TheAlanGame_BigScreen;

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

public class Test_FieldBig extends JPanel implements ActionListener{
    private Timer timer;
    private Alan_ObjectBig alan;
    private Enemy_ObjectBig cole;
    private final int DELAY = 10;

    public Test_FieldBig() {
        initBoard();
    }

    private void initBoard() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.black);
        setDoubleBuffered(true);
        alan = new Alan_ObjectBig();
        cole = new Enemy_ObjectBig();

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
        g.setColor(Color.ORANGE);
        g.fillRect(0,0, getWidth(), 730);
        g.setColor(Color.GRAY);
        g.fillRect(0, 7 * getWidth() / 8, getWidth(), getHeight() / 8);
        g2d.drawImage(alan.getImage(), alan.getX(),
                alan.getY(), this);
        g2d.drawImage(cole.getImage(), cole.getX(), cole.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        step();
    }

    private void step() {
        alan.move();
        repaint();
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {alan.keyReleased(e);
        }
        @Override
        public void keyPressed(KeyEvent e) {alan.keyPressed(e);
        }
    }
}
