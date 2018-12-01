import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m1,m2;
	MenuItem mi1,mi2,mi3,mi4,mi5;
	String data=" ";
	MyFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setBackground(Color.RED);
		this.setTitle("Menu Example");
		mb=new MenuBar();
		this.setMenuBar(mb);
		m1=new Menu("File");
		m2=new Menu("Edit");
		mb.add(m1);
		mb.add(m2);
		mi1=new MenuItem("New");
		mi2=new MenuItem("Open");
		mi3=new MenuItem("Save");
		mi4=new MenuItem("Cut");
		mi5=new MenuItem("Copy");

		m1.add(mi1);m1.add(mi2);m1.add(mi3);
		m2.add(mi4);m2.add(mi5);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);

	}

public void actionPerformed(ActionEvent ae)
	{
	}


}



class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
