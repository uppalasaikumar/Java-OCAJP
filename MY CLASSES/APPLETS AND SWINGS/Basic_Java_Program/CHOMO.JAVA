//to create chomo box (or) choice box
/*  public java.awt.Choice();
    public void add(java.lang.String);
    public void addItem(java.lang.String);  */

import java.applet.Applet;
import java.awt.*;
//<applet code = "chomo.class" width ="200" height="100"></applet>

public class chomo extends Applet {
  public void init()  {
     
       Choice seca=new Choice(); 
       Choice secb=new Choice(); 

       seca.addItem("mani");     seca.addItem("chandru");
       seca.addItem("senthil");  seca.addItem("mohan");
       seca.addItem("anand");    seca.addItem("amani");
       seca.addItem("achandru"); seca.addItem("asenthil");
       seca.addItem("amohan");   seca.addItem("aanand");

       secb.addItem("subash");   secb.addItem("bala");
       secb.addItem("sankar");   secb.addItem("raja");

       add(seca); //to add the choice in default layout
       add(secb);
   }
  }
