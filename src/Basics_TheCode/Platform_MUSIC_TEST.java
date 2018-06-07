package Basics_TheCode;


import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;


public class Platform_MUSIC_TEST extends JFrame{
    public Platform_MUSIC_TEST() {
        setTitle("The Alan Game");
        add(new Platforming());
        //add(new Alan_Object());
    }
    public static void main(String[] args) {
        Platform_MUSIC_TEST frame = new Platform_MUSIC_TEST();
        frame.setSize(1400, 1400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        button.addActionListener(new AL());
    }
    public static class AL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            music();
        }
    }
    public static void music() {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        try {
            BGM = new AudioStream(new FileInputStream("Victorious.mp3"));
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);
        }
        catch (IOException error){
            MGP.start(loop);
        }
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
