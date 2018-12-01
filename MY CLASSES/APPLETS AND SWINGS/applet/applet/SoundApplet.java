import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SoundApplet extends JApplet
                         implements ActionListener,
                                    ItemListener {
    AppletSoundList soundList;
    String auFile = "spacemusic.au";
    String aiffFile = "flute+hrn+mrmba.aif";
    String midiFile = "trippygaia1.mid";
    String rmfFile = "jungle.rmf";
    String wavFile = "bottle-open.wav";
    String chosenFile;
    AudioClip onceClip, loopClip;

    JComboBox formats;
    JButton playButton, loopButton, stopButton;
    boolean looping = false;

    public void init() {
        String [] fileTypes = {auFile,
                               aiffFile,
                               midiFile,        
                               rmfFile,
                               wavFile};
        formats = new JComboBox(fileTypes);
        formats.setSelectedIndex(0);
        chosenFile = (String)formats.getSelectedItem();
        formats.addItemListener(this);

        playButton = new JButton("Play");
        playButton.addActionListener(this);

        loopButton = new JButton("Loop");
        loopButton.addActionListener(this);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        stopButton.setEnabled(false);
                
        JPanel controlPanel = new JPanel();
        controlPanel.add(formats);
        controlPanel.add(playButton);
        controlPanel.add(loopButton);
        controlPanel.add(stopButton);
        getContentPane().add(controlPanel);

        startLoadingSounds();   
    }
       
    public void itemStateChanged(ItemEvent e) {
        chosenFile = (String)formats.getSelectedItem();
        soundList.startLoading(chosenFile);
    }

    void startLoadingSounds() {
        //Start asynchronous sound loading.
        soundList = new AppletSoundList(this, getCodeBase());
        soundList.startLoading(auFile);
        soundList.startLoading(aiffFile);
        soundList.startLoading(midiFile);
        soundList.startLoading(rmfFile);
        soundList.startLoading(wavFile);
   }

    public void stop() {
        onceClip.stop();        //Cut short the one-time sound.
        if (looping) {
            loopClip.stop();    //Stop the sound loop.
        }
    }    

    public void start() {
        if (looping) {
            loopClip.loop();    //Restart the sound loop.
        }
    }    

    public void actionPerformed(ActionEvent event) {
        //PLAY BUTTON
        Object source = event.getSource();
        if (source == playButton) {
            //Try to get the AudioClip.
            onceClip = soundList.getClip(chosenFile);
            onceClip.play();     //Play it once.
            stopButton.setEnabled(true); 
            showStatus("Playing sound " + chosenFile + ".");
            if (onceClip == null) {
                showStatus("Sound " + chosenFile + " not loaded yet.");
            }
            return;
        }

        //START LOOP BUTTON
        if (source == loopButton) {
            loopClip = soundList.getClip(chosenFile);
    
            looping = true;
            loopClip.loop();     //Start the sound loop.
            loopButton.setEnabled(false); //Disable loop button.
            stopButton.setEnabled(true); 
            showStatus("Playing sound " + chosenFile + " continuously.");
            if (loopClip == null) {
                showStatus("Sound " + chosenFile + " not loaded yet.");
            }
            return;
        }

        //STOP LOOP BUTTON
        if (source == stopButton) {
            if (looping) {
                looping = false;
                loopClip.stop();    //Stop the sound loop.
                loopButton.setEnabled(true); //Enable start button.
            }
            else if (onceClip != null) {
                onceClip.stop();
            }
            stopButton.setEnabled(false); 
            showStatus("Stopped playing " + chosenFile + ".");
            return;
        }
    }
}
