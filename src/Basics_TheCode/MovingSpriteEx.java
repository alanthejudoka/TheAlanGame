package Basics_TheCode;

import javafx.scene.layout.Background;

import java.awt.*;
import javax.swing.*;

public class MovingSpriteEx extends JFrame {

    public MovingSpriteEx() {

        initUI();
    }

    private void initUI() {
        add(new Test_Field());

        setTitle("Moving sprite");
        setSize(1280, 720);

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

