//Demo on CardLayout
import java.awt.*;
import java.awt.event.*;
class CardDemo extends Frame implements ActionListener
{
	CardLayout cl;
	Panel p;
	GridDemo()
	{
		p = new Panel();
		cl = new CardLayout();
		p.setLayout(cl);
		p.add(new Button("This"));
		p.add(new Button("is"));
		p.add(new Button("a"));
		p.add(new Button("Layout"));
		p.add(new Button("Tester"));
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