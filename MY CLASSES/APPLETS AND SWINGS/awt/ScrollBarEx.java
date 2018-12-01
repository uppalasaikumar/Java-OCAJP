import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
  implements AdjustmentListener
{
  Scrollbar sb1,sb2;
   int position1,position2;
    MyFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
	this.setTitle("ScrollbrExample");
	this.setBackground(Color.cyan);
this.setLayout(new BorderLayout());
/*BorderLayout mech can be used for
to arrange the Gui components at the
Border of the Frame
*/
sb1=new Scrollbar(Scrollbar.VERTICAL);
	this.add(BorderLayout.EAST,sb1);
//EAST Constant present in BorderLayout

sb2=new Scrollbar(Scrollbar.HORIZONTAL);
this.add(BorderLayout.SOUTH,sb2);

	sb1.addAdjustmentListener(this);
	sb2.addAdjustmentListener(this);
		}
public void adjustmentValueChanged(AdjustmentEvent ae)
	{
	position1 =sb1.getValue();
//getValue() can return the Position of sb
	position2=sb2.getValue();
	repaint();
	}
	public void paint(Graphics g)
	{
Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f);
g.drawString("Vertical ScrollBarPosition...."+position1,50,150);
g.drawString("Horizantal Scrollbar Position "+position2,50,180);


	}
}
class ScrollBarEx
{

public static void main(String[] args) 
	{
		new MyFrame();
	}
}
