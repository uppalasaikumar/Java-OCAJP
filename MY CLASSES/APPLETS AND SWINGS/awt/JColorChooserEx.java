import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame 
           implements ChangeListener
{
	JColorChooser cc;
	Container c;
    MyFrame()
	{
		setVisible(true);
		setSize(500,500);
		setBackground(Color.ORANGE);
		c=getContentPane();
		cc=new JColorChooser();
		c.add(cc);
cc.getSelectionModel().addChangeListener(this);
/* getSelection model method returns
present model of the ColorChooser component*/
	}//cons

public  void stateChanged(ChangeEvent ce)
	{
		Color clr=cc.getColor();
	/*
	getColor() method is present in
	JColorChooser.
	This  method returns selected 
	color from ColorChooserComponent
	*/
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(200,200);
f.getContentPane().setBackground(clr);
}//method
}
class  JColorChooserEx 
{
public static void main(String[] args)
	{
		MyFrame mf=new MyFrame();
	}
}
