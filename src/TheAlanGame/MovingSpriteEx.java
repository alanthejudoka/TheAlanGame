package TheAlanGame;
import java.awt.*;
import javax.swing.*;

public class MovingSpriteEx extends JFrame {

    public MovingSpriteEx() {

        initUI();
    }

    private void initUI() {
        add(new Test_Field());
        Sound s = new Sound();
        s.playSong();
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

