import java.awt.*;
import java.awt.event.*;
class  MyFrame extends Frame 
implements ActionListener
{
	MyFrame()
	{
	this.setVisible(true);
	this.setSize(500,500);
	this.setTitle("ButtonExample");
	Button b1=new Button("Red");
	Button b2=new Button("Green");
	Button b3=new Button("Blue");
this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
public void actionPerformed(ActionEvent ae)
	{
	String label=ae.getActionCommand();
		if(label.equals("Red"))
		{
	this.setBackground(Color.red);
		}
		if(label.equals("Green"))
		{
	this.setBackground(Color.green);
		}
		if(label.equals("Blue"))
		{
	this.setBackground(Color.blue);
		}
	}
}
class ButtonEx
{
	public static void main(String[] args) 
	{
	MyFrame mf = new MyFrame();
	}
}