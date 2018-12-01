//Demo on BorderLayout
import java.awt.*;
class BorderDemo extends Frame
{
	BorderDemo()
	{
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add("North",new Button("This"));
		p.add("West",new Button("is"));
		p.add("Center",new Button("a"));
		p.add("East",new Button("Layout"));
		p.add("South",new Button("Tester"));
		add(p);
		//code to close the frame
	}
	public static void main(String[] args) 
	{
		BorderDemo bd = new BorderDemo();
		bd.setVisible(true);
		bd.setSize(500,400);
		bd.setTitle("Border Layout");
	}
}