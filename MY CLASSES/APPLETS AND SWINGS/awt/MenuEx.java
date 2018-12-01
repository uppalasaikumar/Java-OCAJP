import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
        implements ActionListener
     {
	MenuBar mb;
	Menu m;
	MenuItem m1,m2,m3,m4;
	String data=" ";
	MyFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("MenuExample");
		this.setBackground(Color.cyan);
		mb=new MenuBar();
		this.setMenuBar(mb);
		m=new Menu("File");
		mb.add(m);
		m1=new MenuItem("new");
		m2=new MenuItem("open");
		m3=new MenuItem("save");
		m4=new MenuItem("saveAs");
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	data=ae.getActionCommand();
	repaint();
	}
	public void paint(Graphics g)
	{
		this.setForeground(Color.red);
Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f);
g.drawString
	("selected Item...."+data,50,100);
	}
}

class MenuEx 
{
	public static void main(String[] args) 
	{
		new MyFrame();
	}
}
