import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


class JComboBoxDemo extends JFrame 
implements ItemListener
{
	JComboBox box;
	JLabel lbl;
	Container c;
	JComboBoxDemo()
	{
       c=getContentPane();
		box=new JComboBox();

		box.addItem("India");
		box.addItem("Japan");
		box.addItem("US");
		box.addItem("Germany");
	box.setBounds(100,50,100,40);
	//set the Location of combobox
		c.add(box);
	//add combo box to the container
		
		lbl=new JLabel();
	lbl.setBounds(100,200,200,40);
	//set the location of Label
		c.add(lbl);
		//add the Label to content pane
        box.addItemListener(this);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
public void itemStateChanged(ItemEvent ie)
	{
String str=(String)box.getSelectedItem();
//getSelectedItem() returns ObjectType
//i.e selected Item from the Combobox
	lbl.setText("your Selected :"+str);
   }
	}
class  ComboBoxEx
   {
	public static void main(String[] args) 
	{
JComboBoxDemo demo=new JComboBoxDemo();
		demo.setTitle("my combobox");
		demo.setSize(400,400);
		demo.setVisible(true);
		demo.setBackground(Color.RED);

	}
}
