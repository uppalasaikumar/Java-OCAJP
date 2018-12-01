//Demo on Applets
import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
	String msg = "";
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.blue);
		Font f = new Font("Dialog",Font.BOLD,25);
		setFont(f);
		msg += "init";
	}
	public void start()
	{
		msg += "start";
	}
	public void paint(Graphics g)
	{
		msg += "paint";
		g.drawString(msg,10,100);
	}
	public void stop()
	{
		msg += "stop";
	}
	public void destroy()
	{
	}
}