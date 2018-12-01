    // To create a label //
 /* public java.awt.Label();
    public java.awt.Label(java.lang.String);
    public java.awt.Label(java.lang.String,int);    */

import java.applet.Applet;
import java.awt.*;
//<applet code = "label.class" width ="200" height="200"></applet>

public class label extends Applet  {
  public void init()  {
     Label l1,l2,l3 ;
     Label l4,l5 ;
     l1=new Label(" M ");
     l2=new Label(" C ");
     l3=new Label(" A ");
     l4=new Label(" center",Label.CENTER);
     l5=new Label(" right ",Label.RIGHT);

     add(l4);  add(l5);  add(l1);  add(l2);   add(l3);
    }
  }



