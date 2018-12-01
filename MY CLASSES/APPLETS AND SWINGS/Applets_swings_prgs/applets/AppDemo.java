//Demo on applet
import java.awt.*;
import java.applet.*;
public class AppDemo extends Applet
{
	String msg = "";
	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.red);
		Font f = new Font("Book Antiqua",Font.BOLD+Font.ITALIC,22);
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