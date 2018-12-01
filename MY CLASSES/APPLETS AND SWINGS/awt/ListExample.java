import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
    implements ItemListener
    {
	List l;
	Choice c;
	Label l1,l2;
	String data1;
	String data2;
	MyFrame()
	 {
	setVisible(true);
	setSize(500,500);
	l1=new Label("Technologies :");
	l2=new Label("City :");
	l=new List(4,true);
	c=new Choice();
	
	l.add("c");l.add("c++");l.add("java");
l.add(".net");l.add("oracle");l.add("php");
   c.add("Hyd"); c.add("pune");
   c.add("Ban");	c.add("Che");
	
	setLayout(new FlowLayout());
//add the gui components to container
	add(l1);
	add(l);
	add(l2);
	add(c);
//add itemListener to List and Choice
	l.addItemListener(this);
	c.addItemListener(this);
	}//constructor
public void itemStateChanged
	(ItemEvent ie)
	{
//

	}
}