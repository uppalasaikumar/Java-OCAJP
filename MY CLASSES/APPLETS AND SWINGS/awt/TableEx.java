import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
class MyFrame extends JFrame
{
	Container c;
	JTable t;
String[] header={"ENO","ENAME","ESAL"};
String[][] body=
{{"111","aaa","5500"},{"222","bbb","6000"},
	{"333","ccc","7000"}};
	MyFrame()
	{
	this.setVisible(true);
	this.setSize(400,400);
	c=getContentPane();
	c.setBackground(Color.pink);
	
DefaultTableModel model=
	new DefaultTableModel(body,header);
  t=new JTable(model);
	
	JTableHeader th=t.getTableHeader();
  c.setLayout(new FlowLayout());
	c.add(th);
	c.add(t);
	}
}
class TableEx 
{
public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
	}
}
