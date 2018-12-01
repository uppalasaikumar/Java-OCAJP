import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
class  MyFrame extends JFrame 
implements ActionListener
{
	JFileChooser fc;
	Container c;
	JTextField tf;
	JLabel l;
	JButton b;
	MyFrame ()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("FileChooserEx");
		c=getContentPane();
		c.setBackground(Color.pink);
		l=new JLabel("FileName");
		tf=new JTextField(10);
		b=new JButton("Browse");
		c.setLayout(new FlowLayout());
		b.addActionListener(this);
		c.add(l);c.add(tf);c.add(b);
	}
	public void actionPerformed(ActionEvent ae)
	{
		class MyFrame1 extends
			JFrame implements ActionListener
		{
			MyFrame1()
			{
				setVisible(true);
				setSize(500,500);
				
			}
			public void actionPerformed(ActionEvent ae)
			{
				}
		};
		 new MyFrame1();
	}
}
class FileChooserEx
{
	public static void main(String[] args)
	{
		new MyFrame();
	}

}