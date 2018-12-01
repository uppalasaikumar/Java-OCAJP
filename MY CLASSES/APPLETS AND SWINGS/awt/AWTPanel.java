import java.awt.Frame;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.TextField;
class AWTPanel extends Frame 
	{
    AWTPanel() 
		{
	setSize(200, 200);        
    setVisible(true); 
	  
Panel p1 = 
	new Panel(new FlowLayout());
//add  TextField to Panel p1
p1.add(new TextField("0",20));
 
Panel p2 = 
	new Panel(new GridLayout(4, 3));
   //add buttons to Panel p2
    p2.add(new Button("1"));
      p2.add(new Button("2"));
      p2.add(new Button("3"));
      p2.add(new Button("4"));
      p2.add(new Button("5"));
      p2.add(new Button("6"));
      p2.add(new Button("7"));
      p2.add(new Button("8"));
      p2.add(new Button("9"));
      p2.add(new Button("*"));
      p2.add(new Button("0"));
      p2.add(new Button("#"));
//apply Border Layout Mech to Frame
this.setLayout(new BorderLayout());  // "this" Frame sets to BorderLayout
//add panel p1 and panel p2 to Frame
this.add(p1, BorderLayout.NORTH);
this.add(p2, BorderLayout.CENTER);
             }//close the constructor
public static void main(String[] args)
	  {
    AWTPanel   a=  new AWTPanel();  // Let the constructor do the job
   }
}