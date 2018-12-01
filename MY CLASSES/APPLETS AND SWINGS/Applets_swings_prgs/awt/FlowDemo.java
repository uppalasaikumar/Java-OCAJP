//Demo on FlowLayout
import java.awt.*;
import java.awt.event.*;
class FlowDemo extends Frame 
{
	FlowDemo()
	{
		Panel p = new Panel();
		p.setLayout(new FlowLayout());
		p.add(new Button("This"));
		p.add(new Button("is"));
		p.add(new Button("a"));
		p.add(new Button("Layout"));
		p.add(new Button("Tester"));
		add(p);
		//code to close the frame
		addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		});
	}
	
		
	public static void main(String[] args) 
	{
		FlowDemo fd = new FlowDemo();
		fd.setVisible(true);
		fd.setSize(500,400);
		fd.setTitle("Flow Layout");
	}
}