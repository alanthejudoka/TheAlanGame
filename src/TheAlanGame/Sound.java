package TheAlanGame;

import javax.sound.sampled.*;
import java.io.File;

class Sound {
    private String[] files = {"src\\Victorious.mp3"};
    private Clip[] clips = new Clip[files.length];

    public Sound() {
        try {
            for (int i=0; i<files.length; i++) {
                File file = new File(files[i]);

                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                AudioFormat format = audioStream.getFormat();
                DataLine.Info info = new DataLine.Info(Clip.class, format, (int) (audioStream.getFrameLength() * format.getFrameSize()));
                clips[i] = (Clip) AudioSystem.getLine(info);
                // deathClip.addLineListener(this);
                clips[i].open(audioStream);
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to initialize sounds.", e);
        }
    }

    void playSong() {
        clips[2].loop(20000);
        clips[2].setFramePosition(0);
        clips[2].start();
    }

}