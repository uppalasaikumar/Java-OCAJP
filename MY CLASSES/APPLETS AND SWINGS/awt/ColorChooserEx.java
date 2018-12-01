import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Container;
import javax.swing.event.ChangeEvent;

class MyFrame extends JFrame 
implements ChangeListener
{
	JColorChooser cc;
	Container c;
	MyFrame()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("ColorChooserEx");
		c=getContentPane();
		cc=new JColorChooser();
		c.add(cc); 
		/*getSelectionModel is a method it can be used to
		  return present model of color Chooser*/
cc.getSelectionModel().addChangeListener(this);
	}
	public void stateChanged(ChangeEvent ce)
	{
		Color clr=cc.getColor();
		/*it return the selected color 
		from color chooser*/
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(300,300);
	f.getContentPane().setBackground(clr);
	}

}
class  ColorChooserEx
{
	public static void main(String[] args) 
	{
		new MyFrame();
	}
}
