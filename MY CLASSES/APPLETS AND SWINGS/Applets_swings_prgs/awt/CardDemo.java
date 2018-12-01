//Demo on CardLayout
import java.awt.*;
import java.awt.event.*;
class CardDemo extends Frame implements ActionListener
{
	CardLayout cl;
	Panel p;
	static String name[] = {"This","is","a","Layout","Tester"};
	CardDemo()
	{
		p = new Panel();
		cl = new CardLayout();
		p.setLayout(cl);
		for (int i=0;i<name.length;i++)
		{
			Button b = new Button(name[i]);
			p.add(b,name[i]);
			b.addActionListener(this);
		}
		add(p);
		//code to close the frame
	}
	public void actionPerformed(ActionEvent e)
	{
		cl.next(p);
	}
	public static void main(String[] args) 
	{
		CardDemo cd = new CardDemo();
		cd.setVisible(true);
		cd.setSize(500,400);
		cd.setTitle("Card Layout");
	}
}