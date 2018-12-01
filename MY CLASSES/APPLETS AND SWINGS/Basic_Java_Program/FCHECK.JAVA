// To create a checkbox //

/*
    public java.awt.Checkbox();
    public java.awt.Checkbox(java.lang.String);
    public java.awt.Checkbox(java.lang.String,java.awt.CheckboxGroup,boolean);
    public java.awt.Checkbox(java.lang.String,boolean);
    public java.awt.Checkbox(java.lang.String,boolean,java.awt.CheckboxGroup);
*/
import java.applet.Applet;
import java.awt.*;
//<applet code = "check.class" width ="200" height="100"></applet>

public class fcheck extends Frame 
 {
   fcheck()
   {
     
       Checkbox c1=new Checkbox(); 
       Checkbox c2=new Checkbox("java");
       Checkbox c3=new Checkbox("cobol",null,true);
       Checkbox c4=new Checkbox("ALGO",false);
       Checkbox c5=new Checkbox("CA",false,null);

     
      add(c1);
      add(c2);
      add(c3);
      add(c4);
      add(c5);
      
    }
  
public static void main(String [] s)
{
fcheck fc=new fcheck();
fc.show();
}

}
