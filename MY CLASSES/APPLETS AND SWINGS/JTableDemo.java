//creating a table
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
class JTableDemo extends JFrame
{
	JTableDemo()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		Vector data = new Vector();
		Vector row = new Vector();
		row.add("Srinu");
		row.add("Proprietor");
		row.add("75,000.00");
		data.add(row);
		row = new Vector();
		row.add("Kumar");
		row.add("Tech Mgr");
		row.add("50,000.00");
		data.add(row);
		row = new Vector();
		row.add("Devi");
		row.add("Receptionist");
		row.add("2,500.00");
		data.add(row);
		Vector cols = new Vector();
		cols.add("Employee Name");
		cols.add("Designation");
		cols.add("Salary");
		JTable tab = new JTable(data,cols);
		JTableHeader head = tab.getTableHeader();
		c.add("North",head);
		c.add("Center",tab);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		JTableDemo td = new JTableDemo();
		td.setVisible(true);
		td.setSize(500,400);
		td.setTitle("My Table");
	}
}