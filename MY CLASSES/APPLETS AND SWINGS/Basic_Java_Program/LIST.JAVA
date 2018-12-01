     //to create list box 
import java.applet.Applet;
import java.awt.*;
//<applet code = "list.class" width ="400" height="400"></applet>

public class list extends Applet  {
  public void init()  {
     
       List seca=new List(); 
       List secb=new List(); 

       seca.addItem("mani");      seca.addItem("chandru");
       seca.addItem("senthil");   seca.addItem("mohan");
       seca.addItem("anand");     seca.addItem("amani");
       seca.addItem("achandru");  seca.addItem("asenthil");
       seca.addItem("amohan");    seca.addItem("aanand");

       secb.addItem("subash");    secb.addItem("bala");
       secb.addItem("sankar");    secb.addItem("raja");

       add(seca); //to add the choice in default layout
       add(secb);
   }
  }
