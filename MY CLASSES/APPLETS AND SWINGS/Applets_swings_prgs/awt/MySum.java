//program to find sum using text boxes
import java.awt.*;
import java.awt.event.*;
class MySum extends Frame implements ActionListener
{
	Label l1,l2;
	TextField a,b,c;
	Button b1;
	MySum()
	{
		setLayout(new FlowLayout());
		l1 = new Label("Enter Number : ");
		l2 = new Label("Enter Number : ");
		a = new TextField();
		b = new TextField();
		c = new TextField();
		b1 = new Button("SUM");
		add(l1);
		add(a);
		add(l2);
		add(b);
		add(b1);
		add(c);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str1 = a.getText();
		String str2 = b.getText();
		int i = Integer.parseInt(str1);
		int j = Integer.parseInt(str2);
		int k = i+j;
		String str = Integer.toString(k);
		c.setText(str);
	}
	public static void main(String[] args) 
	{
		MySum ms = new MySum();
		ms.setVisible(true);
		ms.setTitle("My Sum");
		ms.setSize(500,400);
	}
}