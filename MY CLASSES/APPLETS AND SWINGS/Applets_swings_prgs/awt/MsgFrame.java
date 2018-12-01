//demo on frames to display messages
import java.awt.*;
class MsgFrame extends Frame
{
	public void paint(Graphics g)
	{
		setBackground(new Color(255,0,0));
		Font f = new Font("Book Antiqua",Font.BOLD+Font.ITALIC,35);
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString("Welcome",10,100);
	}
	public static void main(String[] args) 
	{
		MsgFrame mf = new MsgFrame();
		mf.setVisible(true);
		mf.setSize(500,400);
		mf.setTitle("Message Frame");
		//code to close the frame
	}
}