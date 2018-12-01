import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class MyFrame extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField tf;
JCheckBox c1,c2,c3;
JRadioButton r1,r2;
JList l;
JPasswordField pf;
JComboBox cb;
JTextArea ta;
JButton b;
Container c;
MyFrame()
	{
	this.setVisible(true);
	this.setSize(600,600);
	this.setTitle("registration form");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.getContentPane();
	this.setBackground(Color.cyan);
	this.setLayout(new FlowLayout());
	l1=new JLabel("name");
	l2=new JLabel("password");
	l3=new JLabel("qualifition");
	l4=new JLabel("gender");
	l5=new JLabel("technologies");
	l6=new JLabel("location");
	l7=new JLabel("comments");
	tf=new JTextField(10);
	pf=new JPasswordField(10);
	tf.setToolTipText("Textfield");
	pf.setToolTipText("password");
	c1=new JCheckBox("bsc");
	c2=new JCheckBox("mca");
	c3=new JCheckBox("phd");
	r1=new JRadioButton("male");
	r2=new JRadioButton("female");
	ButtonGroup bg=new ButtonGroup();
	   bg.add(r1);
	   bg.add(r2);
	   String[] list={"c","c++","java"};
	   l=new JList(list);
	   String[] city={"hyd","chennai","banglore"};
		cb=new JComboBox(city);
		ta=new JTextArea(5,20);
		b=new JButton("registration");
		b.addActionListener(this);
		c.add(l1);c.add(tf);c.add(l2);c.add(pf);c.add(l3);
		c.add(c1);c.add(c2);c.add(c3);c.add(l4);
		c.add(r1);c.add(r2);c.add(l5);c.add(l);c.add(l6);
		/*c.add(c6);*/c.add(l7);c.add(ta);c.add(b);
		
	
	}
public void actionPerformed(ActionEvent ae)
	{
	class Display extends JFrame
	{
		String data="";
		Display()
		{
			setVisible(true);
			setSize(500,500);
			this.getContentPane().setBackground(Color.pink);
		}
		public void paint(Graphics g)
		{
			Font f=new Font("arial",Font.BOLD,20);
			g.setFont(f);
			g.drawString("Password..."+pf.getText(),50,75);
			Object[] o=l.getSelectedValues();
			for(int i=0;i<o.length;i++)
			{
				data=data+" "+o[i];
			}
			g.drawString("Technologies"+data,50,125);
			data=" ";
			Object cbb=cb.getSelectedItem();
			g.drawString("city..."+cbb,50,150);
			String comm=ta.getText();
			g.drawString("Comments..."+comm,50,175);

		}
	}
	new Display();
	}
}
class  RegistrationEx
{

	public static void main(String[] args) throws Exception
	{
		new MyFrame();
	}
}
