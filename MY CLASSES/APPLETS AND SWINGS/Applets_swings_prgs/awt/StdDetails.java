//std details
import java.awt.*;
import java.awt.event.*;
class StdDetails extends Frame implements ActionListener
{
	//vars
	Button b;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4,t5;
	String hno[] = {"101","102","103"};
	String name[] = {"a","b","c"};
	String m1[] = {"59","87","76"};
	String m2[] = {"69","75","76"};
	String m3[] = {"44","81","73"};
	StdDetails() //constructor
	{
		setLayout(new FlowLayout());
		b = new Button("Get Details");
		l1 = new Label("Enter H No :");
		l2 = new Label("Std Name :");
		l3 = new Label("Marks1 :");
		l4 = new Label("Marks2 :");
		l5 = new Label("Marks3 :");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		t5 = new TextField(10);
		add(l1);
		add(t1);
		add(b);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		b.addActionListener(this);
		//code to close the frame
	} //end of constructor
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<hno.length;i++)
		{
			if(t1.getText().equals(hno[i]))
			{
				t2.setText(name[i]);
				t3.setText(m1[i]);
				t4.setText(m2[i]);
				t5.setText(m3[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		StdDetails sd = new StdDetails();
		sd.setTitle("Std Details");
		sd.setSize(500,400);
		sd.setVisible(true);
	}
}