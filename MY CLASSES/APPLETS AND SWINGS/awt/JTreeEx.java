import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
class MyFrame extends JFrame 
implements TreeSelectionListener
{
DefaultMutableTreeNode root,dir1,dir2,
	file1,file2,file3;
	JTree tree;
	Container c;
	String data="";

	MyFrame()
	{
		setVisible(true);
		setSize(500,500);
		c=getContentPane();
	c.setLayout(new BorderLayout());
		//create root node
		root=
	new DefaultMutableTreeNode("D:\\");
//create the other nodes
dir1=new DefaultMutableTreeNode("java programs");
dir2=new DefaultMutableTreeNode("Movies");
file1=new DefaultMutableTreeNode("abc.txt");
file2=new DefaultMutableTreeNode("List.java");
file3=new DefaultMutableTreeNode("xyz.txt");
//add the dir1 to root
root.add(dir1);
//add the other nodes to dir1
dir1.add(file1);
dir1.add(file2);
dir1.add(dir2);
dir2.add(file3);
tree=new JTree(root);
c.add(BorderLayout.NORTH,tree);
tree.addTreeSelectionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public void valueChanged(TreeSelectionEvent te)
	{ }
}
class JTreeEx 
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
	}
}
