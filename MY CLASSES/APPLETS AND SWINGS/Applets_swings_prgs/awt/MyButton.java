import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener
{
	Button b1,b2,b3;
	MyButton()
	{
		setLayout(null);
		b1 = new Button("YELLOW");
		b2 = new Button("BLUE");
		b3 = new Button("PINK");

		b1.setBounds(50,50,75,40);
		b2.setBounds(50,100,75,40);
		b3.setBounds(50,150,75,40);

		add(b1);
		add(b2);
		add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void+ windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("YELLOW"))
			setBackground(Color.yellow);
		if(str.equals("BLUE"))
			setBackground(Color.blue);
		if(str.equals("PINK"))
			setBackground(Color.pink);
	}
	public static void main(String[] args) 
	{
		MyButton mb = new MyButton();
		mb.setVisible(true);
		mb.setTitle("My Push Buttons");
		mb.setSize(500,400);
	}
}