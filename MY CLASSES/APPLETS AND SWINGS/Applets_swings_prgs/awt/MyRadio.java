//CheckboxGroup demo for creating radio buttons
import java.awt.*;
import java.awt.event.*;
class MyRadio extends Frame implements ItemListener
{
	String msg = "";
	CheckboxGroup cbg;
	Checkbox y,n;
	MyRadio()
	{
		setLayout(new FlowLayout());
		cbg = new CheckboxGroup();
		y = new Checkbox("Yes",cbg,true);
		n = new Checkbox("No",cbg,false);
		y.setBackground(Color.red);
		n.setBackground(Color.red);
		y.setForeground(Color.blue);
		n.setForeground(Color.blue);
		y.setFont(new Font("Book Antiqua",Font.BOLD,25));
		n.setFont(new Font("Book Antiqua",Font.BOLD,25));
		add(y);
		add(n);
		y.addItemListener(this);
		n.addItemListener(this);
	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	} );		
}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg = "Current Selection : ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,10,100);
	}
	public static void main(String[] args) 
	{
		MyRadio mr = new MyRadio();
		mr.setSize(500,400);
		mr.setTitle("My Radio Buttons");
		mr.setVisible(true);
	}
}