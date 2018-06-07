package Basics_TheCode;


import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Platform_MUSIC_TEST extends JFrame{
    public Platform_MUSIC_TEST() {
        setTitle("The Alan Game");
        add(new Platforming());
        //add(new Alan_Object());

    }
    public static void main(String[] args) throws IOException {
        Platform_MUSIC_TEST frame = new Platform_MUSIC_TEST();
        frame.setSize(1400, 1400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        String song = "Victorious.mp3";
        InputStream in = new FileInputStream(song);

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }
}
class Platforming extends JPanel  {
    public static final Color Brown = new Color(139, 69, 19);
    int x=0, y=0, velX=0, velY=0;

    public Platforming(){
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    protected void paintComponent (Graphics g) {
        int w = getWidth();
        int h = getHeight();

        //atmosphere
        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, w, h);

        //ground
        g.setColor(Brown);
        g.fillRect(0, 800, w, 600);
    }
}
