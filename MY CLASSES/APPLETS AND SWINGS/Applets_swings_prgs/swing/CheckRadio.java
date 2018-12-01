//Creating Check Box and Radio Buttons
import java.awt.*; // for Container class
import java.awt.event.*; //for ActionListener
import javax.swing.*; //for JFrame & Other Components
class CheckRadio extends JFrame implements ActionListener
{
	//vars
	JCheckBox cb1,cb2;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JTextArea ta;
	String msg = "";
	Container c;
	CheckRadio() //Def. Constructor
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.red);
		cb1 = new JCheckBox("J2SE",true);
		cb2 = new JCheckBox("J2EE");
		rb1 = new JRadioButton("Male",true);
		rb2 = new JRadioButton("Female");
		bg = new ButtonGroup();
		ta = new JTextArea(5,20);
		bg.add(rb1);
		bg.add(rb2);
		c.add(cb1);
		c.add(cb2);
		c.add(rb1);
		c.add(rb2);
		c.add(ta);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		//code to close the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(cb1.getModel().isSelected())
			msg += "J2SE";
		if(cb2.getModel().isSelected())
			msg += "J2EE";
		if(rb1.getModel().isSelected())
			msg += "Male";
		if(rb2.getModel().isSelected())
			msg += "Female";
		ta.setText(msg);
		msg = "";
	}
	public static void main(String[] args) 
	{
		CheckRadio cr = new CheckRadio();
		cr.setVisible(true);
		cr.setSize(500,400);
		cr.setTitle("Check Radio");
	}
}