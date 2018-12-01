
//to create  a TextField 
/* Compiled from TextField.java
    public class java.awt.TextField extends java.awt.TextComponent
    public java.awt.TextField();
    public java.awt.TextField(int);
    public java.awt.TextField(java.lang.String);
    public java.awt.TextField(java.lang.String,int);
   
    to see other methods c:>javap java.awt.TextField  */

import java.awt.* ;
import java.applet.* ;
public class textfield extends Applet  {
  public void init()  {
   TextField name =new  TextField("NAME:",20);
   TextField log=new TextField(8);
   TextField pass=new TextField(8);

   pass.setEchoCharacter('*');
   Label llog=new Label("LOGIN");
   Label lpass=new Label("PASSWD");

   add(name);  add(llog);  add(log);  add(lpass);  add(pass);
  } 
}
