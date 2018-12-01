import java.awt.*;
import java.awt.event.*;
class MyCheckbox extends Frame implements ItemListener
{
	String msg = "";
	Checkbox c1,c2,c3;
	MyCheckbox()
	{
		setLayout(new FlowLayout());
		c1 = new Checkbox("Bold",true);
		c2 = new Checkbox("Italic");
		c3 = new Checkbox("Underline");

		add(c1);
		add(c2);
		add(c3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
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
		g.drawString("States of Checkboxes ",20,100);
		msg = "Bold : "+c1.getState();
		g.drawString(msg,20,120);
		msg = "Italic : "+c2.getState();
		g.drawString(msg,20,140);
		msg = "Underline : "+c3.getState();
		g.drawString(msg,20,160);
	}
	public static void main(String[] args) 
	{
		MyCheckbox mc = new MyCheckbox();
		mc.setVisible(true);
		mc.setTitle("My Checkbox");
		mc.setSize(500,400);
	}
}