package Basics_TheCode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingSpriteEx extends JFrame {

    public MovingSpriteEx() {

        initUI();
    }

    private void initUI() {

        add(new Test_Field());

        setTitle("Moving sprite");
        setSize(1600, 900);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MovingSpriteEx ex = new MovingSpriteEx();
            ex.setVisible(true);
        });
    }

}

