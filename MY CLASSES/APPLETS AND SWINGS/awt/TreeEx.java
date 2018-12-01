import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
class  MyFrame extends JFrame implements 
				TreeSelectionListener{
	
DefaultMutableTreeNode  root,dir1,dir2,file1,file2,file3;
JTree tree;
Container c;
JTextArea ta;
String data="  ";
	MyFrame()
	{
		setVisible(true);
		setSize(500,500);
		c=getContentPane();
		c.setLayout(new BorderLayout());
root=new DefaultMutableTreeNode("D:\\");
dir1=new DefaultMutableTreeNode("JavaPrograms");
dir2=new DefaultMutableTreeNode("Movies");
file1=new DefaultMutableTreeNode("abc.txt");
file2=new DefaultMutableTreeNode("list.java");
file3=new DefaultMutableTreeNode("xyz.txt");

root.add(dir1);
root.add(dir2);
dir1.add(file1);
dir1.add(file2);
dir2.add(file3);

tree=new JTree(root);
c.add(BorderLayout.SOUTH,ta);
tree.addTreeSelectionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//cons

public void valueChanged(TreeSelectionEvent te)
	{
	}
}//class

class TreeEx
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
	}
}