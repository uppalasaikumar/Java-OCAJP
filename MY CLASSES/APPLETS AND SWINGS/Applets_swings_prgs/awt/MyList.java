import java.awt.*;
import java.awt.event.*;
class MyList extends Frame implements ItemListener 
{
	List ch;
	String msg[];
	MyList()
	{
		setLayout(new FlowLayout());
		ch = new List(3,true);
		ch.add("English");
		ch.add("Telugu");
		ch.add("French");
		ch.add("Hindi");
		ch.add("Sanskrit");
		add(ch);
		ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("You Selected : ",10,200);
		msg = ch.getSelectedItems();
		int a = 220;
		for(int i=0;i<msg.length;i++)
		{
			g.drawString(msg[i],10,a);
			a+=20;
		}
	}
	public static void main(String[] args) 
	{
		MyList mr = new MyList();
		mr.setSize(500,400);
		mr.setTitle("MY LIST DEMO");
		mr.setVisible(true);
	}
}