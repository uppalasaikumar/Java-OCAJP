//Demo on Frames
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
{
	public static void main(String[] args) 
	{
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
		mf.setSize(400,600);
		mf.setTitle("My Frame");
		mf.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}/*
class MyCls extends WindowAdapter
{
	//public void windowOpened(WindowEvent e){}
	//public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){System.exit(0);}
	//public void windowIconified(WindowEvent e){}
	//public void windowDeiconified(WindowEvent e){}
	//public void windowActivated(WindowEvent e){}
	//public void windowDeactivated(WindowEvent e){}
};*/