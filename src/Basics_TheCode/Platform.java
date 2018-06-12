package Basics_TheCode;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Platform extends JFrame{
    public Platform() {
        setTitle("The Alan Game");
        add(new Platforming());
        //add(new Alan_Object());

    }
    public static void main(String[] args) {
        Platform frame = new Platform();
        frame.setSize(1400, 1400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
class Platforming extends JPanel  {
    public static final Color Brown = new Color(139, 69, 19);


    public Platforming() {

    }

    protected void paintComponent (Graphics g) {
        int w = getWidth();
        int h = getHeight();

        //atmosphere
        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, w, h);

        //ground
        g.setColor(Brown);
        g.fillRect(0, 801, w, 600);

        //g.drawImage(mainCharacter, 100, 800, );


    }

}