//A simple animation in applets
import java.awt.*;
import java.applet.*;
public class Animate extends Applet
{
	public void init()
	{
	}
	public void paint(Graphics g)
	{
		Image i = getImage(getDocumentBase(),"Sunset.jpg");
		for(int x=0;x<800;x++)
		{
			g.drawImage(i,x,0,this);
			try{
				Thread.sleep(50);
			}catch(Exception e){}
		}
	}
}