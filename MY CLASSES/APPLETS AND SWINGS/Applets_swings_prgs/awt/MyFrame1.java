//Demo on Frames
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	static Image img;
	MyFrame()
	{
		img = Toolkit.getDefaultToolkit().getImage("s.gif");
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img,0);
		try{
			mt.waitForID(0);
		}catch(Exception e){
		System.out.println("Error");
		}
	}
	public void paint(Graphics g)
	{
		//Font f = new Font("Book Antiqua",Font.BOLD,40);
		//g.setFont(f);
		//g.drawString("Surya Prakash",200,100);
		g.drawImage(img,100,100,null);
	}
	public static void main(String[] args) 
	{
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
		mf.setTitle("My Frame");
		mf.setSize(600,400);
		mf.setIconImage(img);
		mf.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}