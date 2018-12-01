
//to create  a TextArea
/*Compiled from TextArea.java
  public class java.awt.TextArea extends java.awt.TextComponent {
    int rows;
    int columns;
    public static final int SCROLLBARS_BOTH;
    public static final int SCROLLBARS_VERTICAL_ONLY;
    public static final int SCROLLBARS_HORIZONTAL_ONLY;
    public static final int SCROLLBARS_NONE;
    static {};
    public java.awt.TextArea();
    public java.awt.TextArea(int,int);
    public java.awt.TextArea(java.lang.String);
    public java.awt.TextArea(java.lang.String,int,int);
    public java.awt.TextArea(java.lang.String,int,int,int);

    to see other methods c:>javap java.awt.TextArea  */
                                         
import java.awt.* ;
import java.applet.* ;

//<applet code = "textarea.class" width ="800" height="600"></applet>

public class textarea extends Applet  {
   String text=
     "to learn java,you will first"
   + "need to obtain \n two different pieces of"
   + "softwares:\n"
   + "the first is the jdk(java development kid "
   + "text area has 5 types of cons ";

  public void init()  {
   TextArea demo=new TextArea(text,20,40);
   add(demo);
   show();
   }
}
