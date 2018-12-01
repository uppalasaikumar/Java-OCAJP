import java.awt.*;
import java.awt.event.*;
class  MyFrameEx2 extends Frame 
   implements ActionListener
{
Label l1,l2;
TextField tf1,tf2;
Button b1;

String data="";
	MyFrameEx2()
	{
	this.setVisible(true);
	this.setSize(500,500);
	this.setTitle("TextFieldExample");
	this.setBackground(Color.CYAN);
  this.setLayout(new FlowLayout());
		l1=new Label("UserName");
		l2=new Label("Password"); 
		tf1=new TextField(15);
		tf2=new TextField(15);
		tf2.setEchoChar('*');
/*it can be used to hide the data 
on particular textField with 
provided character*/ 
	b1=new Button("Login");
		 
		
b1.addActionListener(this);
//addActionListener to the Button
		this.add(l1);
		//addthe label to the Frame
		this.add(tf1);
	//add the TextField to the Frame
		this.add(l2);
		this.add(tf2);
		this.add(b1);
		//add Button to Frame
	}
public void actionPerformed(ActionEvent ae)
		{
	String uname=tf1.getText();
	String upwd=tf2.getText();
if(uname.equals("sathish")&&upwd.equals("sathish"))
			{
   data="status: Login Success";
			}
			else
			{
   data="status:Login Failure";
			}
		repaint();
/*if we are not using repaint() 
Everytime frame
is not refreshed*/
			
		}
public void paint(Graphics g)
			{
this.setForeground(Color.red);
Font f=new Font
	("arial",Font.BOLD+Font.ITALIC,30);
	g.setFont(f);
	g.drawString(data,50,150);
	//draw the Status on Frame
			}
}
class TextFieldEx
		{
public static void main(String[] args)
		{
	MyFrameEx2 mf=new MyFrameEx2();
	}
	}