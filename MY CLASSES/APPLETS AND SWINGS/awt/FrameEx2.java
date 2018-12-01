import java.awt.*;
import java.awt.event.*;

class WindowListenerEx 
                extends WindowAdapter
{
public void windowClosing(WindowEvent we)
	{
System.out.println("Window Closing");
	System.exit(0);
	}
}
class MyFrame extends Frame
{
	MyFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("MyFrame");
	this.setBackground(Color.ORANGE);
this.addWindowListener(new WindowListenerEx());
	}
}
class  FrameEx2
{
public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
	}
}
