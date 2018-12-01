// To create a button //
/*  public java.awt.Button();
    public java.awt.Button(java.lang.String);
  */
import java.applet.Applet;
import java.awt.*;
//<applet code = "butt.class" width ="200" height="100"></applet>

public class butt extends Applet {
   public void init() {
     Button b1,b2;
     b1=new Button("Welcome");
     add(b1);
     b2=new Button();
     add(b2);
    }
  }


