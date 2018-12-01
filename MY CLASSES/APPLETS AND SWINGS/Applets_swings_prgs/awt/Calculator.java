import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class  Calculator extends Frame implements ActionListener
{
	//variable declaration
	int l=0,m=0,n=0,k=0,a=0,i=0,j=0;
	String ch="";
	String str="";
	String str1="";
	String str2="";
	TextField t;	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,c1;
	//constructor definition of the class
	Calculator()
	{
		setLayout(null);

		t=new TextField(25);

		b1=new Button("7");
		b2=new Button("8");
		b3=new Button("9");
		b4=new Button("/");
		b5=new Button("4");
		b6=new Button("5");
		b7=new Button("6");
		b8=new Button("*");
		b9=new Button("1");
		b10=new Button("2");
		b11=new Button("3");
		b12=new Button("-");
		b13=new Button(".");
		b14=new Button("0");
		b15=new Button("=");
		b16=new Button("+");
		c1=new Button("Clr");

		t.setBounds(20,30,180,30);
		b1.setBounds(20,70,30,30);
		b2.setBounds(70,70,30,30);
		b3.setBounds(120,70,30,30);
		b4.setBounds(170,70,30,30);
		b5.setBounds(20,110,30,30);
		b6.setBounds(70,110,30,30);
		b7.setBounds(120,110,30,30);
		b8.setBounds(170,110,30,30);
		b9.setBounds(20,150,30,30);
		b10.setBounds(70,150,30,30);
		b11.setBounds(120,150,30,30);
		b12.setBounds(170,150,30,30);
		b13.setBounds(20,190,30,30);
		b14.setBounds(70,190,30,30);
		b15.setBounds(120,190,30,30);
		b16.setBounds(170,190,30,30);
		c1.setBounds(100,230,30,30);

		add(t);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(c1);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		c1.addActionListener(this);

		

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		str=e.getActionCommand();
		if(str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||
			str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9")||str.equals("0")||str.equals("."))
		{
			i=str2.length();
			if(i==0)
			{
				t.setText(str);
				str2=str;
			}
			else
			{
				str2 += str;
				t.setText(str2);				
			}
		}
		else if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))
		{
			ch=str;
			str="";
			t.setText(str);
			str1 = str2;
			str2 = "";
		}
		else if(str.equals("="))
		{
			j=str1.length();
			k=str2.length();
			if(k==0)
			{
				t.setText(str1);
				str1="";
			}
			else if(j!=0&&k!=0)
			{
				if(ch.equals("+"))
				{
					l=Integer.parseInt(str1);
					m=Integer.parseInt(str2);
					n=l+m;
					str1=Integer.toString(l);
					str2=Integer.toString(m);
					str=Integer.toString(n);
					t.setText(str);
					str1="";
					str2="";
				}
				else if(ch.equals("-"))
				{
					l=Integer.parseInt(str1);
					m=Integer.parseInt(str2);
					n=l-m;
					str1=Integer.toString(l);
					str2=Integer.toString(m);
					str=Integer.toString(n);
					t.setText(str);
					str1="";
					str2="";
				}
				else if(ch.equals("*"))
				{
					l=Integer.parseInt(str1);
					m=Integer.parseInt(str2);
					n=l*m;
					str1=Integer.toString(l);
					str2=Integer.toString(m);
					str=Integer.toString(n);
					t.setText(str);
					str1="";
					str2="";
				}
				else if(ch.equals("/"))
				{
					l=Integer.parseInt(str1);
					m=Integer.parseInt(str2);
					if(m==0)
					{
						t.setText("INFINITY");
					}
					else
					{
					n=l/m;
					str1=Integer.toString(l);
					str2=Integer.toString(m);
					str=Integer.toString(n);
					t.setText(str);
					}
					str1="";
					str2="";
				}				
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		c.setVisible(true);
		c.setSize(250,280);
		c.setTitle("Calculator");
	}
}