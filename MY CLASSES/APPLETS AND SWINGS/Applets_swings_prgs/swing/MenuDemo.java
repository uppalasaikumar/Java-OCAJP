//Demo on JMenu
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MenuDemo extends JFrame implements ActionListener
{
	Container c;
	JMenuBar mb;
	JMenu file,edit,font;
	JMenuItem op,cl,cp,pt;
	JCheckBoxMenuItem pr;

	MenuDemo()
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
		cl.setEnabled(false);

		file.addSeparator();

		file.add(font);

		font.add("Arial");
		font.add("Times New Roman");
		font.add("Cosmic Sans ms");

		edit.add(cp);
		edit.add(pt);
		
		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);

		op.addActionListener(this);
		cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(op.isArmed())
			this.openFile();
		if(cp.isArmed())
			System.out.println("Copy Selected ......");
		if(pt.isArmed())
			System.out.println("Paste Selected ......");
		if(pr.getModel().isSelected())
			System.out.println("Printer on ......");
		if(!pr.getModel().isSelected())
			System.out.println("Printer off ......");
	}
	public static void main(String[] args)
	{
		MenuDemo md = new MenuDemo();

		md.setVisible(true);
		md.setSize(500,400);
		md.setTitle("My Menu Frame");

	}
	void openFile()
	{
		JFileChooser fc = new JFileChooser();

		int i = fc.showOpenDialog(this);

		if(i == fc.APPROVE_OPTION)
		{
			System.out.println("Open Selected ......");
			System.out.println(fc.getSelectedFile().getName());
		}
	}
}