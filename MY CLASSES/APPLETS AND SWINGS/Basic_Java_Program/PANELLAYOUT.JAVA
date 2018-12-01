import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code=panellayout width=800 height=600></applet>*/
public class panellayout extends Applet 
{
        Frame f1=new Frame();
        Panel p1,p2,p3,p4;
        Label l1,l2,l3,l4,l5;
        public void init()
        {

                setLayout(null);
                p1=new Panel();
                p2=new Panel();
                p3=new Panel();
                p4=new Panel();
                l1=new Label("One ");
                l2=new Label("Two");
                l3=new Label("Three");
                l4=new Label("Four");
                l5=new Label("Five");

                p1.setLayout(new FlowLayout());
                p2.setLayout(new BorderLayout());
                p3.setLayout(new GridLayout(2,2));
                p1.setBackground(Color.red);
                p2.setBackground(new Color(200,100,200));
                p3.setBackground(new Color(100,150,200));


                p1.add(new Label("Hai"));
                p1.add(new Button("Hello"));
                p1.add(new TextField("Sahana"));
                p1.add(new TextField("Hema.."));
                p1.add(new TextField("Mca "));
                p1.setBounds(20,20,600,50);
                add(p1);
                p2.add(l1,BorderLayout.SOUTH);
                p2.add(l2,BorderLayout.NORTH);
                p2.add(l3,BorderLayout.CENTER);
                p2.add(l4,BorderLayout.EAST);
                p2.add(l5,BorderLayout.WEST);
                p2.setBounds(20,100,200,200);
                add(p2);
                p3.add(new Button("First Button"));
                p3.add(new Button("Second Button"));
                p3.add(new Button("Third Button"));
                p3.add(new Button("Fourth Button"));
                p3.setBounds(300,100,200,200);
                add(p3);


        }
        
}




                        
                        




