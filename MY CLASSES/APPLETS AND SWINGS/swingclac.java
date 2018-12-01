//program that that demonstrates JTextField,JButton,JLablel
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swingclac extends JApplet implements ActionListener
{
JTextField t1,t2,t3;
JButton addr,subt,mult,divd;
public void init()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
addr=new JButton("ADD");
subt=new JButton("SUB");
mult=new JButton("MUL");
divd=new JButton("DIVIDE");
addr.addActionListener(this);
subt.addActionListener(this);
mult.addActionListener(this);
divd.addActionListener(this);
cp.add(new JLabel("Enter no.1"));
cp.add(t1);
cp.add(new JLabel("Enter no.2"));
cp.add(t2);
cp.add(new JLabel("Result:"));
cp.add(t3);
cp.add(addr);
cp.add(subt);
cp.add(mult);
cp.add(divd);
}
public void actionPerformed(ActionEvent ae)
{
double a,b,c;
a=Double.parseDouble(t1.getText());
b=Double.parseDouble(t2.getText());
if(ae.getSource()==addr)
{
c=a+b;
t3.setText(Double.toString(c));
}
else if(ae.getSource()==subt)
{
	if(a>b)
	{
	c=a-b;
	t3.setText(Double.toString(c));
	}
	else
	{
	c = b - a;
	t3.setText(Double.toString(c));
	}
}
else if(ae.getSource()==mult)
{
c=a*b;
t3.setText(Double.toString(c));
}
else
{
if(b==0)
{
	t3.setText("ZERO NOT ALLOWED...");
}
else{
c=a/b;
t3.setText(Double.toString(c));
}
}

}
}
/*<applet code="swingclac" width="500" height="500">
</applet>*/





