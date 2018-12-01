import javax.swing.*;
import java.applet.*;
import java.net.URL;

class AppletSoundLoader extends Thread {
    JApplet applet;
    AppletSoundList soundList;
    URL baseURL;
    String relativeURL;

    public AppletSoundLoader(JApplet applet, 
                             AppletSoundList soundList,
                             URL baseURL,
                             String relativeURL) {
        this.applet = applet;
        this.soundList = soundList;
        this.baseURL = baseURL;
        this.relativeURL = relativeURL;
        setPriority(MIN_PRIORITY);
        start();
    }

    public void run() {
        AudioClip audioClip = applet.getAudioClip(baseURL, relativeURL);
        soundList.putClip(audioClip, relativeURL);
    }
}
