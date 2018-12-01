//Creating a menu
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file,edit,font;
	JMenuItem op,cl,cp,pt;
	JCheckBoxMenuItem pr;
	Container c;
	MyMenu()
	{
		c = getContentPane();
		c.setLayout(new BorderLayout());
		mb = new JMenuBar();
		c.add("North",mb);
		file = new JMenu("File");
		edit = new JMenu("Edit");
		font = new JMenu("Font");
		mb.add(file);
		mb.add(edit);
		op = new JMenuItem("Open");
		cl = new JMenuItem("Close");
		cp = new JMenuItem("Copy");
		pt = new JMenuItem("Paste");
		file.add(op);
		file.add(cl);
		edit.add(cp);
		edit.add(pt);
		cl.setEnabled(false);
		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);
		file.addSeparator();
		file.add(font);
		font.add("Arial");
		font.add("Times New Roman");
		font.add("Courier");
		op.addActionListener(this);
		cl.addActionListener(this);
		pt.addActionListener(this);
		cp.addActionListener(this);
		pr.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(op.isArmed()) 
			this.openFile();
		if(cl.isArmed())
			System.out.println("Close Selected");
		if(cp.isArmed())
			System.out.println("Copy Selected");
		if(pt.isArmed())
			System.out.println("Paste Selected");
		if(pr.getModel().isSelected())
			System.out.println("Printer is On ........");
		if(!pr.getModel().isSelected())
			System.out.println("Printer is Off ........");
	}
	public static void main(String[] args) 
	{
		MyMenu mm = new MyMenu();
		mm.setSize(500,400);
		mm.setVisible(true);
		mm.setTitle("My Menu");
	}
	void openFile()
	{
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);
		System.out.println(i);
		if(i==JFileChooser.APPROVE_OPTION)
			System.out.println("Selected file = "+fc.getSelectedFile().getName());
	}
}