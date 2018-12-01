import java.io.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame implements
    ActionListener
      {
 Frame f1=new Frame("MyFrame");
TextArea ta1=new TextArea(20,40);
MenuBar mb=new MenuBar();
Menu file=new Menu("File");
Menu color=new Menu("color");
Menu font=new Menu("Font");
MenuItem open=new MenuItem("open");
MenuItem save=new MenuItem("save");
MenuItem exit=new MenuItem("exit");
MenuItem blue=new MenuItem("blue");
MenuItem red=new MenuItem("red");
MenuItem orange=new MenuItem("orange");
MenuItem bold=new MenuItem("bold");
MenuItem italic=new MenuItem("italic");
	MyFrame()
    	{
		f1.setSize(500,500);
	    f1.setVisible(true);
//add the 3 menuitems to Filemenu
		file.add(open);
		file.add(save);
		file.add(exit);
//add the 3 menuitems to colormenu	
		color.add(blue);
		color.add(red);
		color.add(orange);
//add the 2 menuitems to fontmenu
		font.add(bold);
		font.add(italic);
//add the 3 menu's to menubar.
		mb.add(file);
		mb.add(color);
		mb.add(font);
 //set the menubar to frame
		f1.setMenuBar(mb);
//add the TextArea component to frame
		f1.add(ta1);
//add the actionlistener to menuitems
open.addActionListener(this);
save.addActionListener(this);
exit.addActionListener(this);
blue.addActionListener(this);
red.addActionListener(this);
orange.addActionListener(this);
bold.addActionListener(this);
italic.addActionListener(this);

}//close the constructor.
public void actionPerformed
	(ActionEvent ae)
	{
//to get the selected item label
String s1=ae.getActionCommand();
//we should use getActionCommand();
	if(s1.equals("exit"))
	System.exit(1);
	
	if(s1.equals("blue"))
ta1.setBackground(Color.BLUE);
	
	if(s1.equals("red"))
 ta1.setBackground(Color.RED);
	if(s1.equals("orange"))
 ta1.setBackground(Color.ORANGE);

  if(s1.equals("bold"))
		{
 Font fo1=new Font
	("Arial",Font.BOLD,15);
	ta1.setFont(fo1);
	   	}
  if(s1.equals("italic"))
		{
Font fo2=
new Font("arial",Font.ITALIC,15);
	ta1.setFont(fo2);
		}

 if(s1.equals("open"))
		{
/*to prepare FileDialog box we should
FileDialog constructor.
FileDialog fd=
new FileDailog
(Frame f,String s,int cons);
*/
FileDialog fd1=new 
FileDialog(f1,"open",FileDialog.LOAD);
//LOAD is constant it is present
//FileDialog class.
			fd1.setVisible(true);
String dir1=fd1.getDirectory();
  String fi=fd1.getFile();
	String path=dir1+"/"+fi;
		this.openFile(path);
		}
	if(s1.equals("save"))
		{
FileDialog fd2=new FileDialog
	(f1,"save",FileDialog.SAVE);
	
		fd2.setVisible(true);
	String dir2=fd2.getDirectory();
	String fname=fd2.getFile();
	String path=dir2+"/"+fname;
	this.saveFile(path);
		}
	}//close actionPerformed()
public void saveFile(String path)
		{
	try{
//to get the data from TextArea
	String data=ta1.getText();
//prepare fos with  the path
FileOutputStream fos=
	new FileOutputStream(path);
/*
prepare an equivalent byte[] for
the String data.
to do this we can call String class
getBytes()
*/
	byte ba[] =data.getBytes();
//by using write(byte[] b) method 
//we can write the data to fos
	fos.write(ba);
	fos.close();
	}
	catch(IOException e)
			{
			}
		}//saveFile()
public void openFile(String path)
		{
	try{
//prepare FIS
FileInputStream fis=
	new FileInputStream(path);
	//get the size of fis
   int size=fis.available();
/*create an equivalent byte[] for the
given size */
	byte b[]=new byte[size];
	//read data from fis.
//to do this we can use read(byte[] b)
	fis.read(b);
/*prepare an  equivalent String object
for the given byte[] b
*/
	String data=new String(b);
//add string data to TextArea
	ta1.setText(data);
	fis.close();
	   }
  catch(IOException e)
			{
	         }
	}//openFile()
public static void main(String[] args)
			{
	MyFrame mf=new MyFrame();
		     }
	}
