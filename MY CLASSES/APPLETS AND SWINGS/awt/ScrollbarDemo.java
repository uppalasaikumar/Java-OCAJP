import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
implements AdjustmentListener 
{
	Scrollbar sb;
	int position;
	MyFrame()
	{
	this.setVisible(true);
this.setSize(400,500);
this.setTitle("ScrollbarEx");
sb=new Scrollbar(Scrollbar.VERTICAL);
this.add(BorderLayout.EAST,sb);
sb.addAdjustmentListener(this);
	}//constructor
public void adjustmentValueChanged
	(AdjustmentEvent ae)
	{
   position=ae.getValue();
   repaint();
	}
public void paint(Graphics g)
	{
Font f=new Font("arial",Font.BOLD,35);
	g.setFont(f);
g.drawString
("ScrollBar Position:"+position,100,150);
	}
}
class ScrollbarDemo
{
public static void main(String[] args)
	{
	MyFrame mf=new MyFrame();
	}
}