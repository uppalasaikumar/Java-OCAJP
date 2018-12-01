//Closing a frame
import java.awt.*; // for Frame class
import java.awt.event.*; //for WindowListener interface
class MyFrame extends Frame
{
	public static void main(String[] args) 
	{
		MyFrame mf = new MyFrame();
		mf.setTitle("My Frame");
		mf.setSize(500,400);
		mf.setVisible(true);
		mf.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
		);
	}
}