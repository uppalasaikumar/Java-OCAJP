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
//<applet code = "checkg.class" width ="200" height="200"></applet>

public class checkg extends Applet
 {
  public void init()
   {
     
       CheckboxGroup sem3 =new  CheckboxGroup();
       Checkbox c1=new Checkbox("OD",sem3,true);
       Checkbox c2=new Checkbox("java");
       Checkbox c3=new Checkbox("cobol",sem3,true);
       Checkbox c4=new Checkbox("ALGO",false);
       Checkbox c5=new Checkbox("CA",true,sem3);

       CheckboxGroup sem4 =new  CheckboxGroup();
       Checkbox c6=new Checkbox("VB",sem4,true);
       Checkbox c7=new Checkbox("VC++",sem4,false);
       Checkbox c8=new Checkbox("NETWORKING",sem4,false);

     
      add(c1);
      add(c2);
      add(c3);
      add(c4);
      add(c5);
      add(c6);
      add(c7);
      add(c8);

    }
  }
