import java.awt.*;
import java.awt.event.*;
class MyChoice extends Frame implements ItemListener 
{
	Choice ch;
	String msg;
	MyChoice()
	{
		setLayout(new FlowLayout());
		ch = new Choice();
		ch.add("");
		ch.add("English");
		ch.add("Telugu");
		ch.add("French");
		ch.add("Hindi");
		ch.add("Sanskrit");
		ch.add("Tamil");
		add(ch);
		ch.addItemListener(this);
	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("You Selected : ",10,200);
		msg = ch.getSelectedItem();
		g.drawString(msg,10,220);
	}
	public static void main(String[] args) 
	{
		MyChoice mr = new MyChoice();
		mr.setSize(500,400);
		mr.setTitle("My Choice Menu");
		mr.setVisible(true);
	}
}