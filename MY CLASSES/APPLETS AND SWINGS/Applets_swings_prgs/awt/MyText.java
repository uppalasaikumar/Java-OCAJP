//working with labels and text fields
import java.awt.*;
import java.awt.event.*;
class MyText extends Frame implements ActionListener
{
	Label n,p;
	TextField name,pass;
	MyText()
	{
		setLayout(new FlowLayout());
		n = new Label("Enter Name : ",Label.RIGHT);
		p = new Label("Enter Password : ",Label.RIGHT);
		name = new TextField(20);
		pass = new TextField(15);
		pass.setEchoChar('*');
		add(n);
		add(name);
		add(p);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name : "+name.getText(),20,100);
		g.drawString("Password : "+pass.getText(),20,120);
	}
	public static void main(String[] args) 
	{
		MyText mt = new MyText();
		mt.setSize(500,400);
		mt.setTitle("My Text Boxes");
		mt.setVisible(true);
	}
}