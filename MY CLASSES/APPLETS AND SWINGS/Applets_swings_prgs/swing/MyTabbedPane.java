//Creating Tabbed Pane
import java.awt.*;
import javax.swing.*;
class MyTabbedPane extends JFrame
{
	MyTabbedPane()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JTabbedPane jtp = new JTabbedPane();
		c.add("North",jtp);
		jtp.addTab("Countries",new Countries());
		jtp.addTab("Capitals",new Capitals());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		MyTabbedPane tp = new MyTabbedPane();
		tp.setVisible(true);
		tp.setTitle("My Tabbed Pane");
		tp.setSize(500,400);
	}
}
class Countries extends JPanel
{
	Countries()
	{
		JButton b1,b2,b3;
		b1 = new JButton("America");
		b2 = new JButton("India");
		b3 = new JButton("Japan");
		add(b1);
		add(b2);
		add(b3);
	}
};
class Capitals extends JPanel
{
	Capitals()
	{
		JCheckBox b1,b2,b3;
		b1 = new JCheckBox("Washington");
		b2 = new JCheckBox("New Delhi");
		b3 = new JCheckBox("Tokyo");
		add(b1);
		add(b2);
		add(b3);
	}
};