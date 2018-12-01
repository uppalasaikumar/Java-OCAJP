  import java.awt.*;
  import java.awt.event.*;
class  MyFrame extends Frame
implements ItemListener   
       {
	Label l1,l2;
	CheckboxGroup cg;
	Checkbox c1,c2,c3,c4,c5;
	String data1=" ";
	String data2=" ";
	MyFrame()
	 {
	setVisible(true);
	setSize(500,500);

	setTitle("check box example");
	setBackground(Color.cyan);

	setLayout(new FlowLayout());
	l1=new Label("Qualification");
	l2=new Label("Gender");
	cg=new CheckboxGroup();
	c1=new Checkbox("BSc");
	c2=new Checkbox("MCA");
	c3=new Checkbox("B.TECH");

c4=new Checkbox("male",cg,false);
c5=new Checkbox("female",cg,false);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		add(l1);
		add(c1);
		add(c2);
		add(c3);
		add(l2); 
		add(c4);
		add(c5);		
	}//close the constructor
public void itemStateChanged
	(ItemEvent ie)
		{
  if(c1.getState()==true)
			{
	data1=data1+c1.getLabel()+" ";
			}
//to get the label of the selected check
//box (or)radio button we 
//should use   getLabel()
	if (c2.getState()==true)
			{
	data1=data1+c2.getLabel()+" ";
			}
	if (c3.getState()==true)
			{
	data1=data1+c3.getLabel();
			}
	if (c4.getState()==true)
			{
	data2=c4.getLabel();
			}
	if (c5.getState()==true)
			{
	   data2=c5.getLabel();
			}
	repaint();//refresh the frame
		}
 public void paint(Graphics g)
			{
	setForeground(Color.BLUE);
Font f=
	new Font("Arial",Font.BOLD,30);
		
		g.setFont(f);
g.drawString("Qualification :"
            +data1,50,200);

          data1=" ";

g.drawString("Gender:"
               +data2,100,300);
			}//paint()
		}//MyFrame-class
class CheckboxEx
		{
public static void main(String[] args)
			{
MyFrame mf=new MyFrame();
			}
		}
