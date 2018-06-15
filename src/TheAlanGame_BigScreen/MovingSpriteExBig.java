package TheAlanGame_BigScreen;
import TheAlanGame.Test_Field;

import java.awt.*;
import javax.swing.*;

public class MovingSpriteExBig extends JFrame {

    public MovingSpriteExBig() {

        initUI();
    }

    private void initUI() {
        add(new Test_FieldBig());
        add(new Test_Field());
        Sound s = new Sound();
        s.playSong();

        setTitle("Moving sprite");
        setSize(1600, 900);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MovingSpriteExBig ex = new MovingSpriteExBig();
            ex.setVisible(true);
        });
    }

}

