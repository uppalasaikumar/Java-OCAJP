//going from one frame to another
import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements ActionListener
{
	Button b;
	String str = "Hello Second Frame";
	Frame1()
	{
		setLayout(null);
		b = new Button("Next");
		b.setBounds(40,200,75,40);
		add(b);
		b.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		Frame2 f2= new Frame2(str);
		f2.setSize(500,400);
		f2.setTitle("Second Frame");
		f2.setVisible(true);
	}
	public static void main(String[] args) 
	{
		Frame1 f1= new Frame1();
		f1.setSize(500,400);
		f1.setTitle("First Frame");
		f1.setVisible(true);
	}
}
class Frame2 extends Frame implements ActionListener
{
	Button b;
	String str;
	Frame2(String str)
	{
		this.str = str;
		setLayout(new FlowLayout());
		b = new Button("Back");
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		this.dispose();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,200);
	}
};