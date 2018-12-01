import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
      implements ItemListener
{
	Label l1,l2;
	List l;
	Choice c;
	String data1=" ";
	String data2=" ";
	MyFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
	this.setTitle("ListExample");
		this.setBackground(Color.green);
	this.setLayout(new FlowLayout());
		l1=new Label("Technologies");
		l=new List(5,true);
l.add("C");l.add("C++");l.add("Java");
l.add(".Net");l.add("Cobol");l.add("SAP");
		
		
		l.addItemListener(this);
		l2=new Label("city");
		c=new Choice();
		c.add("Hyderabad");
		c.add("Chennai");
		c.add("Banglore");
		c.add("pune");
		c.addItemListener(this);
		this.add(l1);
		this.add(l);
		this.add(l2);
		this.add(c);
	}
public void itemStateChanged(ItemEvent ie)
	{
	String[] s=l.getSelectedItems();
/*to get the selected Items from
List we should call getSelectedItems()
*/
		for(int i=0;i<s.length;i++)
		{
			data1=data1+" "+s[i];
		}

		data2=c.getSelectedItem();

	repaint();//to refresh the Frame
	}
public void paint(Graphics g)
	{
	this.setForeground(Color.blue);
Font f=new Font("arial",Font.BOLD,30);
	g.setFont(f);

g.drawString("Technologies:"+data1,50,250);
	
g.drawString("City   :"+data2,100,350);
	data1=" ";
	}
	}

class  ListEx
{
public static void main(String[] args) 
	{
		new MyFrame();
	}
}
