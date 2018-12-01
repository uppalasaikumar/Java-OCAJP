Ex-µ PROGRAÍ FOÒ EXCEPTIONS

import java.io.*;
public class exceptions
{
        DataInputStream dis=new DataInputStream(System.in);
        public static void main(String args[])
        {
                exceptions e1=new exceptions();
                
                DataInputStream d=new DataInputStream(System.in);
                try
                {
          s1="";



 System.out.println("Exceptions");
 System.out.println("1: IO/ArrayIndexOutOfBoundsException");
 System.out.println("2: FileNotFoundException");
 System.out.println("3: ArithematicExceptions");
 System.out.println("4: Exit");
 System.out.println("Enter  Ur Choice 1/2/3/4");
 int u=Integer.parseInt(d.readLine());
 switch(u)
 {
         case 1:  e1.ioarray();
                  break;
         case 2:  e1.files();
                  break;
         case 3:  e1.arithmatic();
                  break;
         case 4:  e1.exit();
                  break;
 }
 System.out.println("Do U want To Continue n/y");
 s1=d.readLine();
        
                        }while(s1.equalsIgnoreCase("y"));
                }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
        public void files()
        {

          try
          {
          System.out.println("Enter the File name");
          String s=dis.readLine();
          File f=new File(s);
          FileReader fr=new FileReader(f);
          if(f.isFile())
          {
               System.out.println("**********");
          }
          }
          catch(FileNotFoundException e)
          {
Š         System.out.println("File Not Found Exception");
 }
 catch(Exception e)
 {
         System.out.println("Exception :"+e);
         
 }

   }
   public void arithmatic()
   {
           try
           {
                   int a=0;
                   System.out.println(a);
                   int b=45/a;
           }
           catch(ArithmeticException e)
           {
                   
                   System.out.println("Arithmatic Exception ");
                   
           }

   }
   public void ioarray()
   {
         try
         {
             System.out.println("Enter the Size of Ur Array");
             int n=Integer.parseInt(dis.readLine());
             int c[]=new int[n];
             System.out.println("Enter the Elements for Ur Array");
             for(int i=0;i<n;i++)
             {
                     c[i]=Integer.parseInt(dis.readLine());
             }
             System.out.println("Our Passed Elements");
             for(int i=0;i<=n;i++)
             {
                     System.out.println(c[i]);
             }


         }
         catch(IOException e)
         {
                   System.out.println("  IOEXception ");
         }
         catch(NumberFormatException e)
         {
                   System.out.println("  Number Format Exception ");
                   
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
                   System.out.println(" ArrayIndexOutOfBoundsException ");
                   
         }
   }        public void exit()
   {                system.exit(1); } }¯ PROGRAÍ FOÒ CLIENÔ COMMUNICATIOÎ USINÇ DATAGRAÍ SOCKET 
import java.io.*;
import java.net.*;
public class Dclient
{
 public static void main(String ar[])throws Exception
 {
                DatagramSocket ds=new DatagramSocket();
                String s;
                DataInputStream d=new DataInputStream(System.in);
                DatagramPacket dp;
                while(true)
                {
                   s=d.readLine();
                   byte b[]=new byte[512];
                   b=s.getBytes();
                   dp=new DatagramPacket(b,b.length,InetAddress.
                                   getByName("localhost"),5000);
                        ds.send(dp);
                        if(s.equals("exit"))
                        break;
                }
        }
}

¯ Ex-1· PROGRAÍ TÏ IMPLEMENÔ SERVER-COMMUNICATIOÎ ­ SERVEÒ SIDE

import java.io.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Sserver width=500 height=500></applet>*/
public class Sserver extends Applet implements ActionListener
{
        Button b1;
        TextArea ta1,ta2;
        String s1,s2;
        Socket s;
        ServerSocket ss;
        PrintWriter pw;
        DataInputStream d,d1;
        public void init()
        {
                setLayout(null);
                ta1=new TextArea();
                ta2=new TextArea();
                b1=new Button("Send");
                b1.addActionListener(this);
                setBackground(new Color(200,100,100));
                ta1.setBounds(40,60,400,70);
                ta2.setBounds(40,200,400,70);
                b1.setBounds(200,400,60,20);
                b1.addActionListener(this);
                add(ta1);
                add(ta2);
                add(b1);
        }
        public void actionPerformed(ActionEvent ae)
        {
                try
                {
                        ss=new ServerSocket(5000);
                        s=ss.accept();
                        s2=ta1.getText();
                        pw=new PrintWriter(s.getOutputStream(),true);
                        pw.println(s2);
                        System.out.println(s2);
                        d1=new DataInputStream(s.getInputStream());
                        s1=d1.readLine();
                        if(s1.equals(""))
                        {
                        ta2.append("It is not Conencted");
                        }
                        else
                        {
                        ta2.append("From Client :"+s1);
                        }
                        System.out.println("From Client"+s1);
                        ta1.setText("");
                }
                catch(Exception e)
                {
                       System.out.println(e);            
}      
}
¯ Ex-1· PROGRAÍ FOÒ SERVEÒ SOCKEÔ ­ CLIENÔ SIDE
import java.io.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Sclient width=500 height=500></applet>*/
public class Sclient extends Applet implements ActionListener
{
        Button b1;
        TextArea ta1,ta2;
        String s1,s2;
        Socket s;
        PrintWriter pw;
        DataInputStream d;
        public void init()
        {
                setLayout(null);
                ta1=new TextArea();
                ta2=new TextArea();
                b1=new Button("Send");
                b1.addActionListener(this);
                setBackground(new Color(200,100,100));
                ta1.setBounds(40,60,400,70);
                ta2.setBounds(40,200,400,70);
                b1.setBounds(200,400,60,20);
                b1.addActionListener(this);
                add(ta1);
                add(ta2);
                add(b1);
        }
        public void actionPerformed(ActionEvent ae)
        {
                try
                {
                        s=new Socket("localhost",5000);
                        d=new DataInputStream(s.getInputStream());
                        s1=d.readLine();
                        ta2.append("From Server :"+s1);
                        System.out.println("From Server"+s1);
                        pw=new PrintWriter(s.getOutputStream(),true);
                        pw.println(ta1.getText());
                        System.out.println(ta1.getText());
                        ta1.setText("");
                }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
}
Ex-19 Program foò Sessioî Trackinç usinç HttðSessioî object

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class track extends HttpServlet
{
  HttpSession hs;
  int c;
  String s;

  public void doGet(HttpServletRequest req,HttpServletResponse res) 
                    throws IOException,ServletException
  {
    hs = req.getSession(true);
    res.setContentType("text/html");
    PrintWriter pw = res.getWriter();

    if (hs.isNew())
    {
      pw.println("<form method=get action=http://localhost:
                                   8080/servlet/track>");
      pw.println(" Enter your name <input type=text name=un><br>");
      pw.println("<input type=submit value=callservlet>");
      pw.println("</form>");
      s = "Not Initialized";
      c = 0;
      hs.putValue("Uname",s);
      hs.putValue("c",String.valueOf(c));
    }
    else
    {
      c = Integer.parseInt((String)hs.getValue("c"));
      if (c==0)
      {
        s = req.getParameter("un");
        hs.putValue("uname",s);
      }
      s = (String)hs.getValue("uname");
      pw.println("<form method=get action=http://localhost:
                         8080/servlet/track>");
      pw.println("<h1>Hai !  "+ s + "<h1>");
      pw.println("<br><br>U Visited me for the "+(++c)+" time");
      pw.println("<br><input type=submit value=callservlet>");
      pw.println("</form>");
      hs.putValue("c",String.valueOf(c));
      if (c==5)
      {
        hs.invalidate();
      }
    }
  }
}

//     PROGRAM FOR INVENTORY DETAILS USING CLASS OBJECTS            

import java.io.*;
class item
{
  String name[] = new String[20];
  int code[] = new int[20];
  float price[] = new float[20];
  int qty[] = new int[20];
  float total[] = new float[20];
  float cumu[] = new float[20];
  int n;
  public void get()
  {
   try
   {
     BufferedReader br = new BufferedReader(new 
               InputStreamReader(System.in));
     System.out.print("\t\t\tEnter the Number of Items : ");
     n = Integer.parseInt(br.readLine());
     for (int i=1; i<=n; i++)
     {
       System.out.print("\n\n\t\tITEM NAME  : ");
       name[i] = br.readLine();
       System.out.print("\t\tITEM CODE  : ");
       code[i] = Integer.parseInt(br.readLine());
       System.out.print("\t\tITEM PRICE : ");
       price[i] = Float.parseFloat(br.readLine());
       System.out.print("\t\tQUANTITY   : ");
       qty[i] = Integer.parseInt(br.readLine());
       total[i] = (float)(qty[i] * price[i]);
       System.out.print("\n\t\tTOTAL PRICE : "+total[i]);
       System.out.print("\n\t\t------------");

     }
   } catch (Exception e) { }
  }

  public void cal()
  {
    float s = 0;
    for (int i=1; i<=n; i++)
    {
      s = s + total[i];
    }
    System.out.print("\n\n\t\t\tCUMULATIVE AMOUNT : "+s);
    System.out.print("\n\t\t\t*******************");
  }


  public static void main(String args[])
  {
    item t = new item();
    t.get();
    t.cal();
  }
}
//  PROGRAM TO FIND THE AREA OF CIRCLE, RECTANGLE AND TRIANGLE  

import java.io.*;
class area
{
 public void cal(float r)
 {
   float pi = 3.14f;
   double ar = pi * r * r;
   System.out.print("\n\t\tArea of the Circle : "+ar);
 }

 public void cal(int l, int b)
 {
   double ar = (float)(0.5 * l * b);
   System.out.print("\n\t\tArea of the Triangle : "+ar);
 }

 public void cal(int s)
 {
  int ar = s * s;
  System.out.print("\n\t\tArea of the Square : "+ar);
 }

  public static void main(String args[])
  {
    area a = new area();
 try
 {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("\t\t\tAREA OF A CIRCLE");
   System.out.println("\t\t\t****************");
   System.out.print("\n\t\tEnter the Radius : ");
   float r = Float.parseFloat(br.readLine());

      a.cal(r);

      System.out.println("\n\n\t\t\tAREA OF TRIANGLE");
      System.out.println("\t\t\t****************");
      System.out.print("\n\t\tEnter the Length : ");
      int l = Integer.parseInt(br.readLine());
      System.out.print("\n\t\tEnter the Breadth : ");
      int b = Integer.parseInt(br.readLine());

      a.cal(l,b);

      System.out.println("\n\n\t\t\tAREA OF SQUARE");
      System.out.println("\t\t\t**************");
      System.out.print("\n\t\tEnter the side : ");
      int s = Integer.parseInt(br.readLine());

      a.cal(s);

    } catch (Exception e) { } }}
Êþº¾  - › R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j š  … † ‡ ˆ ‰ Š ‹ Œ 
  <
 ! <
  =
  >
 # ?
 # @
 # A	  B
  C
 " D
  E	 $ F
  G	  H	  I	 $ J
   K
  L
  M
  N
 # O	  P
  Q u l u n u o u s } m } r ~ {  l ‚ p ƒ l „ x Ž l  | ‘ { ’ y “ q ” s • s – k — k ˜ | ™ l 			 				**************** 
			******* 			====			======= 			ACCOUNT TYPE      :  			DEPOSITOR BALANCE :  			DEPOSITOR NAME    :  			DEPOSITOR NUMBER  :  		 2. WITHDRAW 
		 3. LIST 
			 
				DEPOSITOR'S LIST 
			CHOICES $
			Do You Want To Continue ? y/n :  
			Enter Your Choice :  
			NAME			BALANCE 
		 1. DEPOSIT 
		 Deposit Amount   :  
		 Depositor Number  :  
		 Depositor Number :  
		 WithDrawal Amount :   
		Cannot Retrieve - Low Balance 
		Current Balance of  Êþº¾  - L & ' ( ) * 9 : ; > ? @ A B
  //    PROGRAM FOR STUDENT DETAILS USING MULTIPLE INHERITANC AND INTERFACE

import java.io.*;
class Student
{

     public int rollno;
}

class Test extends Student 
{
     public int m1,m2,wm1,wm2;

     public void Test_Input() throws IOException
     {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print(" Enter the RollNo           : ");
        rollno=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-1           : ");
        m1=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-1 Weightage : ");
        wm1=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-2           : ");
        m2=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-2 Weightage : ");
        wm2=Integer.parseInt(dis.readLine());
     }
}

interface Sports
{
    public void Sports_Input() throws IOException;
}


class Result extends Test implements Sports
{

   int tot,sm,wsm;
   public static void main(String args[]) throws IOException
   {
    
      DataInputStream dis=new DataInputStream(System.in);
      System.out.println("==========================================");	
      System.out.print(" Enter the No of Student's  : ");
      int n=Integer.parseInt(dis.readLine());
      System.out.println("==========================================");	

      Result a[]=new Result[n];

      for(int i=0;i<n;i++)
      {
       a[i]=new Result();
       a[i].Test_Input(); 
       a[i].Sports_Input();
       a[i].tot=a[i].m1*a[i].wm1/100+a[i].m2*a[i].wm2/100+
                    a[i].sm*a[i].wsm/100;
      }


  System.out.println("=============================================================");
  System.out.println("                  Student's Mark List                        ");
  System.out.println("=============================================================");
  System.out.println("R-No   Mk-1    M1(Wt)  Mk-2    M2(Wt)   Spt    Spt(Wt)"+                                                                             "  Total");
  System.out.println("=============================================================");
      for(int i=0;i<n;i++)
      {
         System.out.println(a[i].rollno+"\t"+a[i].m1+"\t"
                                   +a[i].wm1+"%\t"+a[i].m2+
         "\t"+a[i].wm2+"%\t"+a[i].sm+"\t"+a[i].wsm
                                   +"%\t  "+a[i].tot);
      }
  System.out.println("=============================================================");
   }

   public void Sports_Input() throws IOException
   {
      int tw=100;
      DataInputStream dis=new DataInputStream(System.in);
      System.out.print(" Enter the Sports Mark      : ");
      sm=Integer.parseInt(dis.readLine());
      System.out.println("==========================================");	
      wsm=tw-(wm1+wm2); 
  }
}      
Êþº¾  - ~ D E F G H I T U \ ] ` b c g h i j k l m
 
 -
  -
  .
  /
 
 0
  1
  2
  3	  4	  5	  6	  7
  8
  9
  :
  ;	  <	 
 =
  >	 
 ?
  @	  A	  B	 
 C S K S N S Q a K d K e M e P f Z n X o X q [ r O s Q t Q u J v X w X x J y X z L { X | X } X 	 =                  Student's Mark List                          Enter the No of Student's  :   Enter the Sports Mark      :  %	 %	   ()Ljava/lang/String; ()V (I)Ljava/lang/String; (I)Ljava/lang/StringBuffer; (Ljava/io/InputStream;)V (Ljava/lang/String;)I ,(Ljava/lang/String;)Ljava/lang/StringBuffer; (Ljava/lang/String;)V ([Ljava/lang/String;)V <init> *========================================== ============================================================== Code 
Exceptions I LineNumberTable Ljava/io/InputStream; Ljava/io/PrintStream; =R-No   Mk-1    M1(Wt)  Mk-2    M2(Wt)   Spt    Spt(Wt)  Total Result Result.java 
SourceFile Sports Sports_Input Student Test 
Test_Input append in java/io/DataInputStream java/io/IOException java/io/PrintStream java/lang/Integer java/lang/String java/lang/StringBuffer java/lang/System m1 m2 main out parseInt print println readLine rollno sm toString tot valueOf wm1 wm2 wsm   
       y X     w X     } X      S K  V        *· ±    Y       $  a K  V   i     9d<» Y² · M²  ¶ "*,¶ $¸ !µ &²  ¶ #**´ **´ +`dµ ,±    Y       N  O  P  Q ! R ) S 8 L W      	 p R  V  Þ    Z» Y² · L²  ¶ #²  ¶ "+¶ $¸ !=²  ¶ #½ 
N6§ ^-» 
Y· S-2¶ //        PROGRAM TO PRINT THE GREATEST USING APPLET  

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*<applet code=biggest width=400 height=300></applet>*/

public class biggest extends Applet implements ActionListener
{
        Label l1,l2,l3;
        TextField t1,t2,t3;
        TextArea ta;
        Button b1,b2;
        int x,y,z;

        public void init()
        {
                setLayout(null);
                l1=new Label("First Number");
                l2=new Label("Second Number");
                l3=new Label("Third Number");
                b1=new Button("Click Me For Result");
                b2=new Button("Clear");
                t1=new TextField();
                t2=new TextField();
                t3=new TextField();
                ta=new TextArea();
                b1.addActionListener(this);
                b2.addActionListener(this);
                l1.setBounds(40,40,130,20);
                t1.setBounds(200,40,130,20);
                l2.setBounds(40,80,130,20);
                t2.setBounds(200,80,130,20);
                l3.setBounds(40,120,130,20);
                t3.setBounds(200,120,130,20);
                b1.setBounds(40,180,150,20);
                b2.setBounds(220,180,70,20);
                ta.setBounds(60,240,250,90);
                add(b1);add(l1);add(l2);add(l3);add(t1);add(t2);add(t3);
                ;add(ta);add(b2);
          }

        public void actionPerformed(ActionEvent ae)
        {
          if(ae.getSource()==b1)
          {
                  ta.setText("");
                  x=Integer.parseInt(t1.getText());
                  y=Integer.parseInt(t2.getText());
                  z=Integer.parseInt(t3.getText());
                  if(x>y)
                  {
                   if(x>z)
                     {
                            ta.append(x+" is the biggest Number");
                     }
                     else
                     {
                           ta.append(z+" is the biggest Number");                       
Š }                   }
                   else
                   {
                   if(y>z)
                   {
                           ta.append(y+" is the biggest Number");
                   }
                   else
                   {
                           ta.append(z+" is the biggest Number");
                   }
                    }
          }
          else if(ae.getSource()==b2)
          {
                  t1.setText("");
                  t2.setText("");
                  t3.setText("");
          }
  }
}
 
Êþº¾  -  
     ()V Code 
Exceptions LineNumberTable Result Result.java 
SourceFile Sports Sports_Input Test java/io/IOException java/lang/Object                       -1µ PROGRAÍ FOÒ SERVEÒ COMMUNICATIOÎ USINÇ DATAGRAÍ SOCKET 

Program-2
--------- 
import java.io.*;
import java.net.*;

public class Dserver
{
        public static void main(String ar[])throws Exception
        {
                DatagramSocket ds=new DatagramSocket(5000);
                String s;
                DatagramPacket dp;
                while(true)
                {
                        byte b[]=new byte[512];
                        dp=new DatagramPacket(b,b.length);
                        ds.receive(dp);
                        s=new String(b).trim();
                        if(s.equals("exit"))
                        break;
                        System.out.println(s);
                }
        }
}Ex-1¶  PROGRAÍ TÏ DISPLAÙ ADDRESÓ ANÄ NAMÅ USINÇ FACTORÙ METHOD

import java.io.*;
import java.net.*;
public class inetaddname
{
        public static void main(String ar[])throws UnknownHostException
        {
                InetAddress i1;
                InetAddress i2;
                i1=InetAddress.getByName("localhost");
                System.out.println(i1.toString());
                i2=InetAddress.getLocalHost();
                System.out.println(i2.toString());
                String str1=i2.getHostAddress();
                System.out.println("Host Address : "+str1);
                String str2=i2.getHostName();
                System.out.println("Host Name : "+str2);
        }
}
            Ex-1³  PROGRAÍ FOÒ INVENTORÙ DETAILÓ USINÇ MENU

import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class menu extends Frame implements ActionListener
{
        MenuBar mbar;
        Menu mnu;
        MenuItem mitem;
        public menu()
        {
                mbar=new MenuBar();
                setMenuBar(mbar);
                mnu=new Menu("Item Details");
                mbar.add(mnu);
                mitem=new MenuItem("Item Code");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Item Name");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Quantity");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Price");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Supplier Code");
                mnu.add(mitem);
                mitem.addActionListener(this);
                mitem=new MenuItem("Supplier Name");
                mnu.add(mitem);
                mitem.addActionListener(this);
                setSize(700,500);
                setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
                Dia d;
                if(ae.getActionCommand().equals("Item Code"))
                {
                        d=new Dia(this,"It is the Item Code");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Item Name"))
                {
                        d=new Dia(this,"It is the Item Name");
                        d.setLocation(300,200);


                }
                if(ae.getActionCommand().equals("Quantity"))
                {
                        d=new Dia(this,"It is the Quantity");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Price"))
                {
Š                        d=new Dia(this,"It is the Price");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Supplier Code"))
                {
                        d=new Dia(this,"It is the Supplier Code");
                        d.setLocation(300,200);

                }
                if(ae.getActionCommand().equals("Supplier Name"))
                {
                        d=new Dia(this,"It is the Supplier Name");
                        d.setLocation(300,200);

                }
        }
        public static void main(String ar[])
        {
                new menu();
        }
}
class Dia extends Dialog implements ActionListener
{
        Button b1;
        Label l1;
        public Dia(Frame f,String s)
        {
                super(f,s);
                setLayout(null);
                l1=new Label(s);
                b1=new Button("Ok");

                l1.setBounds(20,30,150,20);
                b1.setBounds(70,70,50,20);
                add(l1);
                add(b1);
                b1.addActionListener(this);
                setSize(300,100);
                setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
                dispose();
        }
}
Š/¯ Ex­2°    PROGRAÍ FOÒ MAIÎ HTML
<html>
<head>
<title> Cookies Program</title>
</head>
<body>
<h2><i>Welcome To Cookies Program</i></h2>
<br>
<p>
  A Cookie class encapsultes a cookie. A cookie is stored
  on a client and contains state information. They are
  valuable for tracking user activities. Servlet writes a
  cookie to a user's machine using addCookie() of the
  HttpServletResponse interface.
</p>
<a href=http://localhost:8080/servlet/mymain>Proceed......</a>
</body>
</html>


//¯ Prograí foò Firsô HTML

<html>
<head>
<title>Bell Labs</title>
</head>
<body bgcolor = white>
<h3><i>Methods defined by HttpServletRequest Interface</i></h3>
<table border=1>
<tr>
<td>Methods
<td>Description
</tr>
<tr>
<td>Cookie[] getCookies()
<td>Returns an array of Cookie in this request
</tr>
<tr>
<td>String getIntHeader(String field)
<td>Returns int equivalent of header field
</tr>
<tr>
<td>String getRemoteUser()
<td>Returns name of the user who issued request
</tr>
</table>
<br>
<a href=http://localhost:8080/servlet/mycookie?f=2>Next Page</a>
</body>
</html>
/¯ Prograí foò Second.HTML
<html>
<head>
<title>Sun MicroSystems</title>
</head>
<body bgcolor=yellow>
<h1>Methods Defined by Cookie</h1>
<table border=1>
<tr>
<td>Method
<td>Description
</tr>
<td>Object clone()
<td>Returns a copy of this object
</tr>
<tr>
<td>int getMaxAge()
<td>Returns Maximum Age of cookie in seconds
</tr>
<tr>
<td>void setSecure(boolean secure)
<td>sets the security flag to secure
</tr>
<tr>
<td>void setDomain(String d)
<td>sets the domain to d
</tr>
</table>
<br>
<a href=http://localhost:8080/servlet/mycookie?f=1> Next Page</a>
</body>
</html>

¯ Eø-2°-a       PROGRAÍ FOÒ COOKIES 

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class mycookie extends HttpServlet
{
  final int mycookielife = 10000;
  String webarr[] = {"null","first.html","second.html"};

  public void doGet(HttpServletRequest req,
     HttpServletResponse res) throws ServletException, IOException
  {
    Cookie c;
    PrintWriter pw;
    pw = res.getWriter();

    try
    {
      res.setContentType("text/html");
      int val=Integer.parseInt(req.getParameter("f"));
      System.out.println("Val is : "+val);
      c = new Cookie("mycook",String.valueOf(val));
      c.setMaxAge(mycookielife);
      res.addCookie(c);
      System.out.println("Cookie is created .....");
      res.sendRedirect("http://localhost:8080/"+webarr[val]);
    } catch (Exception e)
    {
      pw.println("<h1>Error in Website "+e+"</h1>");
      System.out.println(e);
    }
  }
}
²0­Â        PROGRAÍ FOÒ COOKIES

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class mymain extends HttpServlet
{
   String webarr[] = {"null","first.html","second.html"};
   int i;
   public void doGet(HttpServletRequest req,
     HttpServletResponse res) throws ServletException,IOException
   {
     PrintWriter pw = res.getWriter();
     try
     {
       res.setContentType("text/html");
       Cookie arr[] = req.getCookies();
       boolean flag=false;

       if (arr != null)
       {
         for (i=0; i<arr.length; i++)
         {
           if(arr[i].getName().equals("mycook"))
           {
             System.out.println(arr[i].getName()+" found....");
             flag = true;
             break;
           }
        }
      }

       if (flag==true)
       {
         System.out.println("Taking you to where u left off.");
         int val = Integer.parseInt(arr[i].getValue());
         res.sendRedirect("http://localhost:8080/"+webarr[val]);
       }
      else
      {
        System.out.println("Taking u to the first page....");
        res.sendRedirect("http://localhost:8080/first.html");
      }
     }
     catch (Exception e)
     {
        System.out.println(e);
        pw.println("<h1>Error: "+e);
     }
   }
}
Eø­1²  PROGRAÍ FOÒ PAYROLÌ SYSTEM

import java.awt.*;
import java.awt.event.*;
public class payroll extends Frame implements ActionListener
{
        TextField t1,t2,t3,t4,t5;
        Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
        Checkbox c,c1,c2,c3,c4;
        CheckboxGroup cg1;
        List ll1;
        Font f1,f2;
        Choice ch1;
        Button b1;
        public payroll()
        {
                setLayout(null);
                f1=new Font("Sans Serif",Font.BOLD,25);
                f2=new Font("Sans Serif",Font.BOLD,15);
                l1=new Label("Employee ID :");
                l2=new Label("Employee Name :");
                l3=new Label("Age :");
                l4=new Label("Designation :");
                l5=new Label("Grade :");
                l6=new Label("Gender :");
                l7=new Label("Basic Pay");
                t1=new TextField();
                t2=new TextField();
                t3=new TextField();
                b1=new Button("Click");
                ll1=new List(3);
                cg1=new CheckboxGroup();
                c2=new Checkbox("A");
                c3=new Checkbox("B");
                c4=new Checkbox("C");
                ch1=new Choice();
                for(int i=20;i<=60;i++)
                {
                        ch1.add(""+i);
                }
                ll1.add("Manager");
                ll1.add("Clerk");
                ll1.add("Lecturer");
                ll1.add("S/W Engineer");
                ll1.add("H/W Engineer");
                b1.addActionListener(this);
                c=new Checkbox("Female",cg1,false);
                c1=new Checkbox("Male",cg1,false);
                l=new Label("PayRoll System");
                l.setBounds(300,50,200,40);
                l1.setBounds(200,120,150,20);
                t1.setBounds(400,120,100,20);
                l2.setBounds(200,160,150,20);
                t2.setBounds(400,160,100,20);
                l3.setBounds(200,200,150,20);
                ch1.setBounds(400,200,100,20);
                l4.setBounds(200,240,150,20);
                ll1.setBounds(400,240,150,25);
                l5.setBounds(200,290,150,20);
                c2.setBounds(400,290,40,20);
                c3.setBounds(460,290,40,20);
Š                c4.setBounds(520,290,40,20);
                l6.setBounds(200,330,150,20);
                c.setBounds(400,330,90,20);
                c1.setBounds(510,330,90,20);
                l7.setBounds(200,400,150,20);
                t3.setBounds(400,400,100,20);
                b1.setBounds(350,440,100,20);
                ll1.setFont(f2);
                l.setFont(f1);
                l1.setFont(f2);
                l2.setFont(f2);
                l3.setFont(f2);
                l4.setFont(f2);
                l5.setFont(f2);
                l6.setFont(f2);
                l7.setFont(f2);
                t1.setFont(f2);
                t2.setFont(f2);
                t3.setFont(f2);
                c1.setFont(f2);
                c2.setFont(f2);
                c3.setFont(f2);
                c.setFont(f2);
                c4.setFont(f2);
                ch1.setFont(f2);
                b1.setFont(f2);
               add(l1);add(t1);add(ch1);
               add(c1);add(c);add(ll1);add(c2);
               add(c3);add(c4);add(t2);add(t3);
               add(l2);add(l);add(l3);add(l4);add(l5);
               add(l6);add(l7);add(b1);
        }
        public void actionPerformed(ActionEvent ae)
        {
                int basic=Integer.parseInt(t3.getText());
                int hra=(15*basic)/100;
                int ta=(10*basic)/100;
                int da=(12*basic)/100;
                int tax=(4*basic)/100;
                int grosspay=basic+hra+ta+da;
                int netpay=grosspay-tax;
                l8=new Label("HRA :"+hra);
                l9=new Label("TA :"+ta);
                l10=new Label("DA :"+da);
                l11=new Label("GrossPay :"+grosspay);
                l12=new Label("Tax :"+tax);
                l13=new Label("NetPay :"+netpay);
                l8.setFont(f2)» l9.setFont(f2);  l10.setFont(f2);
                l11.setFont(f2)» l12.setFont(f2);l13.setFont(f2);
                l8.setBounds(200,490,100,20);
                l9.setBounds(350,490,100,20);
                l10.setBounds(500,490,100,20);
                l11.setBounds(200,530,150,20);
                l12.setBounds(370,530,100,20);
                l13.setBounds(500,530,120,20);
                add(l8);add(l9);add(l10);add(l11);add(l12);add(l13);
            }  public static void main(String ar[])
            {
                    payroll p=new payroll();
                    p.setSize(800,600);
                    p.setVisible(true); }}
Š
Ex­17 PROGRAÍ TÏ IMPLEMENÔ CLIENT-COMMUNICATIOÎ  

import java.io.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Sclient width=500 height=500></applet>*/
public class Sclient extends Applet implements ActionListener
{
        Button b1;
        TextArea ta1,ta2;
        String s1,s2;
        Socket s;
        PrintWriter pw;
        DataInputStream d;
        public void init()
        {
                setLayout(null);
                ta1=new TextArea();
                ta2=new TextArea();
                b1=new Button("Send");
                b1.addActionListener(this);
                setBackground(new Color(200,100,100));
                ta1.setBounds(40,60,400,70);
                ta2.setBounds(40,200,400,70);
                b1.setBounds(200,400,60,20);
                b1.addActionListener(this);
                add(ta1);
                add(ta2);
                add(b1);
        }
        public void actionPerformed(ActionEvent ae)
        {
                try
                {
                s=new Socket("localhost",5000);
                d=new DataInputStream(s.getInputStream());
                s1=d.readLine();
                ta2.append("From Server :"+s1);
                System.out.println("From Server"+s1);
                pw=new PrintWriter(s.getOutputStream(),true);
                pw.println(ta1.getText());
                System.out.println(ta1.getText());
                ta1.setText("");
                }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
}
            Ex­ ´    PROGRAÍ FOÒ STUDENÔ DETAILÓ USINÇ 
/¯          MULTIPLÅ INHERITANCÅ ANÄ INTERFACE

import java.io.*;
class Student
{

     public int rollno;
}

class Test extends Student 
{
     public int m1,m2,wm1,wm2;

     public void Test_Input() throws IOException
     {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print(" Enter the RollNo           : ");
        rollno=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-1           : ");
        m1=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-1 Weightage : ");
        wm1=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-2           : ");
        m2=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-2 Weightage : ");
        wm2=Integer.parseInt(dis.readLine());
     }
}

interface Sports
{
    public void Sports_Input() throws IOException;
}


class Result extends Test implements Sports
{

   int tot,sm,wsm;
   public static void main(String args[]) throws IOException
   {
    
      DataInputStream dis=new DataInputStream(System.in);
      System.out.println("==========================================");	
      System.out.print(" Enter the No of Student's  : ");
      int n=Integer.parseInt(dis.readLine());
      System.out.println("==========================================");	

      Result a[]=new Result[n];

      for(int i=0;i<n;i++)
      {
       a[i]=new Result();
       a[i].Test_Input(); 
       a[i].Sports_Input();
       a[i].tot=a[i].m1*a[i].wm1/100+a[i].m2*a[i].wm2/100+
                    a[i].sm*a[i].wsm/100;
      }


Š  System.out.println("=======================================
                                        ======================");
  System.out.println("                  Student's Mark List                        ");
  System.out.println("======================================
                                        =======================");
  System.out.println("R-No   Mk-1    M1(Wt)  Mk-2    M2(Wt)   
                                        Spt    Spt(Wt)"+   			                                                   "  Total");
  System.out.println("==========================================
                                       ===================");
      for(int i=0;i<n;i++)
      {
         System.out.println(a[i].rollno+"\t"+a[i].m1+"\t"
                                   +a[i].wm1+"%\t"+a[i].m2+
         "\t"+a[i].wm2+"%\t"+a[i].sm+"\t"+a[i].wsm
                                   +"%\t  "+a[i].tot);
      }
  System.out.println("===================================
                              ==========================");
   }

   public void Sports_Input() throws IOException
   {
      int tw=100;
      DataInputStream dis=new DataInputStream(System.in);
      System.out.print(" Enter the Sports Mark      : ");
      sm=Integer.parseInt(dis.readLine());
      System.out.println("==========================================");	
      wsm=tw-(wm1+wm2); 
  }
}      
ŠEx-· Program­ foò studenô detailó usinç package1:

package First;
import java.io.*;

class S_Student
{
     public int rollno;
}

public class S_Test extends S_Student 
{
     public int m1,m2,wm1,wm2;

     public void Test_Input() throws IOException
     {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print(" Enter the RollNo           : ");
        rollno=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-1           : ");
        m1=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-1 Weightage : ");
        wm1=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-2           : ");
        m2=Integer.parseInt(dis.readLine());
        System.out.print(" Enter the Mark-2 Weightage : ");
        wm2=Integer.parseInt(dis.readLine());
     }
}

Program-2:
**********
package Second;
import java.io.*;
public interface Sports
{
    public void Sports_Input() throws IOException;
}

Program-3:
***********
import java.io.*;
import First.S_Test;
import Second.Sports;
class Seventh extends S_Test implements Sports
{

   int tot,sm,wsm;
   public static void main(String args[]) throws IOException
   {
    
      DataInputStream dis=new DataInputStream(System.in);
      System.out.println("==========================================");	
      System.out.print(" Enter the No of Student's  : ");
      int n=Integer.parseInt(dis.readLine());
      System.out.println("==========================================");	

      Seventh a[]=new Seventh[n];

      for(int i=0;i<n;i++)
      {
Š       a[i]=new Seventh();
       a[i].Test_Input(); 
       a[i].Sports_Input();
       a[i].tot=a[i].m1*a[i].wm1/100+a[i].m2
                    *a[i].wm2/100+a[i].sm*a[i].wsm/100;
      }

  System.out.println("========================================
                         =====================");
  System.out.println("                  Student's Mark List ");
  System.out.println("========================================
                         =====================");
  System.out.println("R-No   Mk-1    M1(Wt)  Mk-2    M2(Wt)   Spt    
               Spt(Wt)"+      "  Total");
  System.out.println("===================================
                              ==========================");


      for(int i=0;i<n;i++)
      {
         System.out.println(a[i].rollno+
                    "\t"+a[i].m1+"\t"+a[i].wm1+"%\t"+a[i].m2+
         "\t"+a[i].wm2+"%\t"+a[i].sm+"\t"+a[i].wsm+"%\t  "+
                                   a[i].tot);
      }
  System.out.println("====================================
                              =========================");
   }

   public void Sports_Input() throws IOException
   {
      int tw=100;
      DataInputStream dis=new DataInputStream(System.in);
      System.out.print(" Enter the Sports Mark      : ");
      sm=Integer.parseInt(dis.readLine());
      System.out.println("==========================================");	
      wsm=tw-(wm1+wm2); 
  }
¯Ex-18 PROGRAÍ FOÒ DEALERÓ REGISTRATIOÎ IÎ XYÚ COMPANY
 
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.*;
import java.io.*;
import java.sql.*;
public class exe18 extends HttpServlet
{
   Connection con =null;
   Statement st=null;
   PrintWriter out;
  public void doPost(HttpServletRequest req, HttpServletResponse res) 
                         throws IOException ,ServletException
  {
   try
   {
     res.setContentType("text/html");
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con=DriverManager.getConnection("jdbc:odbc:sahana","scott","tiger");
     st=con.createStatement();              
     out=res.getWriter();
     String val[]=req.getParameterValues("code");
     String name=" ";
     name=val[0];
     String val1[]=req.getParameterValues("name");
     String name1=" ";
     name1=val1[0];
     String  val2[]=req.getParameterValues("add");
     String name2=" ";
     name2=val2[0];
     String  val3[]=req.getParameterValues("person");
     String name3=" ";
     name3=val3[0];
     String  val4[]=req.getParameterValues("exper");
     String name4=" ";
     name4=val4[0];
     String val5[]=req.getParameterValues("turn");
     String name5=" ";
     name5=val5[0];
         st.executeUpdate("Insert into exe18 values('"+name+"','"
         +name1+"','"+name2+"','"+name3+"','"+name4+"','"+name5+"')");
         out.println("<script>");
         out.println("alert(\"Insertion Over\")");
         out.println("</script>");
   } catch(Exception we){ }
    finally
    {
     try
     {
       if(con!=null)
       con.close();
     } catch(Exception xe){out.println(xe);}
    }
   }
  }
..pa
¯ HTMÌ Prograí foò XYÚ Companù Registration
 
<html>
<body>
<head><h2>
<center>XYX COMPANY - REGISTRATION FORM </center>
</h2></head>

<form name="f" method=post action="/servlet/exe18">
<table align="center">
<tr><td><font face="arial" color="black">DEALER CODE    :
          </font><td><Input type="text" name ="code"></tr>
<tr><td><font face="arial" color="black">DEALER NAME    :
          </font><td><Input type="text" name ="name"></tr>
<tr><td><font face="arial" color="black">DEALER ADDRESS :
          </font><td><Input type="text" name ="add"> </tr>
<tr><td><font face="arial" color="black">CONTACT PERSON :
          </font><td><Input type="text" name ="person"></tr>
<tr><td><font face="arial" color="black">EXPERIENCE     :
          </font><td><Input type="text" name ="exper"></tr>
<tr><td><font face="arial" color="black">TURN OVER      :
          </font><td><Input type="text" name ="turn"></tr>
</table><br><br>
<input type="submit" name=submit>
</form>
</body>
</html>
..pa
Êþº¾  - z @ A B C D E F G H b d e f g h i j k l m
 
 +
  +
  ,
  -
  .
  /
 
 0	 
 1	 
 2
 
 3	  4	 
 5	 
 6	  7
  8
  9	 
 :
  ;	 
 <
  =
  >	 
 ? R J R L R M R P \ K ] J ^ Z _ Y ` J a V o T p [ q W r N s O t Y u P v Z w I x I y Y 			Enter the Number of Items :  		ITEM CODE  :  		ITEM PRICE :  		QUANTITY   :  
			******************* 
		------------ 
		TOTAL PRICE :  

			CUMULATIVE AMOUNT :  

		ITEM NAME  :  ()Ljava/lang/String; ()V (F)Ljava/lang/StringBuffer; (Ljava/io/InputStream;)V (Ljava/io/Reader;)V (Ljava/lang/String;)F (Ljava/lang/String;)I (Ljava/lang/String;)V ([Ljava/lang/String;)V <init> Code I LineNumberTable Ljava/io/InputStream; Ljava/io/PrintStream; 
SourceFile [F [I [Ljava/lang/String; append cal code cumu get in item 	item.java java/io/BufferedReader java/io/InputStreamReader java/io/PrintStream java/lang/Exception java/lang/Float java/lang/Integer java/lang/Object java/lang/String java/lang/StringBuffer java/lang/System main n name out 
parseFloat parseInt price print qty readLine toString total   
       p [     ^ Z     t Y     v Z     y Y     _ Y     o T      R J  S   j     6*· *½ µ !*¼
µ *¼µ %*¼
µ '*¼µ **¼µ ±    U   "            	 % 
 -  5   ] J  S   j     :D=§ #*´ *0bD„*´  ¤ÿï² "» Y· #¶ ÐÏà¡±Êþº¾  - r@HõÃ = > ? @ A B C D E F G H ] a b c d e f g h i
  ,
  ,
  -
  .
  /
  0
  1
  2
  3
  4	  5	  6
  7
  8
  9
  :
  ;
  <?à       V J V P V Q V T \ K \ M _ L _ N _ O ` Y k Z l R m S n T o T p I q I 			************** 			**************** 			AREA OF A CIRCLE 
		Area of the Circle :  
		Area of the Square :  ÐÏà¡±ÐÏà¡±ÐÏà¡±//           PROGRAM TO REPRESENT A BANK ACCOUNT  

import java.io.*;
class bank
{  
  String name[] = new String[10];
  int no[] = new int[10];
  String type[] = new String[10];
  int bal[] = new int[10];
  public void get()
  {  
     for (int i=1; i<=2; i++)
     {   
      try
      {
      BufferedReader br = new BufferedReader(new 
                         InputStreamReader(System.in));
      System.out.print("\t\t\tDEPOSITOR NAME    : ");
      name[i] = br.readLine();
      System.out.print("\t\t\tDEPOSITOR NUMBER  : ");
      no[i] = Integer.parseInt(br.readLine());
      System.out.print("\t\t\tACCOUNT TYPE      : ");
      type[i] = br.readLine();
      System.out.print("\t\t\tDEPOSITOR BALANCE : ");
      bal[i] = Integer.parseInt(br.readLine());
    } catch (Exception e){ }
   }
  }

  public void depot()
  {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try
    {
      System.out.print("\n\t\t Depositor Number : ");
      int dno = Integer.parseInt(br.readLine());
      System.out.print("\n\t\t Deposit Amount   : ");
      int damt = Integer.parseInt(br.readLine());
      for (int i=1; i<=2; i++)
      {
        if (no[i] == dno)
        {
          bal[i] = bal[i] + damt;
          System.out.print("\n\t\tCurrent Balance of "+dno+" is "+bal[i]);
        }
      }
    } catch (Exception e) { }
  }

  public void withdraw()
  {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try
    {
      System.out.print("\n\t\t Depositor Number  : ");
      int wno = Integer.parseInt(br.readLine());
      System.out.print("\n\t\t WithDrawal Amount : ");
      int wamt = Integer.parseInt(br.readLine());
      for (int i=1; i<=2; i++)
      {
        if (no[i] == wno)
        {
          int x = wamt + 200;
          if (bal[i] > x)
          {
          bal[i] = bal[i] - wamt;
          System.out.print("\n\t\tCurrent Balance of "+wno+" is "+bal[i]);
          }
          else
          {
            System.out.print("\n\t\tCannot Retrieve - Low Balance");
          }
        }
      }
    } catch (Exception e) { }
  }

  public void list()
  {
    System.out.println("\n\t\t\t\tDEPOSITOR'S LIST");
    System.out.println("\t\t\t\t****************");
    System.out.println("\n\t\t\tNAME\t\t\tBALANCE");
    System.out.println("\t\t\t====\t\t\t=======");
    for (int i=1; i<=2; i++)
     System.out.print("\n\t\t\t"+name[i]+"\t\t\t"+bal[i]);
  }

  public static void main(String args[])
  {
    bank b = new bank();
    b.get();
    String ans ="y";
    try
    {
      BufferedReader br = new BufferedReader(new 
                         InputStreamReader(System.in));
      System.out.println("\n\t\t\tCHOICES");
      System.out.println("\t\t\t*******");
      System.out.println("\n\t\t 1. DEPOSIT");
      System.out.println("\t\t 2. WITHDRAW");
      System.out.println("\t\t 3. LIST");
    do
    {
      System.out.print("\n\t\t\tEnter Your Choice : ");
      int c = Integer.parseInt(br.readLine());
      if (c == 1)
        b.depot();
      else if (c == 2)
        b.withdraw();
      else if (c == 3)
         b.list();
      else
        System.out.println("\n\t\tEnter  a Valid Choice !");

    System.out.print("\n\t\t\tDo You Want To Continue ? y/n : ");
    ans = br.readLine();
    } while(ans.equals("y"));
   } catch(Exception e) { }
  }
}
Êþº¾  -     
     ()V <init> Code I LineNumberTable Result Result.java 
SourceFile Student Test java/lang/Object rollno          
         	        *· ±                 -¶              PROGRAM TO IMPLEMENT THE THREAD BEHAVIOUR   


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.Applet;


/* <applet code="thread.class" width=300 height=300>
   </applet> */

public class thread extends Applet implements Runnable,ActionListener
{
        Thread t1,t2;
        String msg;
        Button b1,b2,b3,b4;
        int x=10,y=10;
        public void init()
        {
                msg="Hai! Welcome to Applet";
                t1=new Thread(this,"one");
                t2=new Thread(this,"Two");
                b1=new Button("Start");
                b2=new Button("Suspend");
                b3=new Button("Resume");
                b4=new Button("Stop");
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                add(b1);
                add(b2);
                add(b3);
                add(b4);
        }
        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==b1)
                {
                   t1.start();
                }
                else if(ae.getSource()==b2)
                {

                     t1.suspend();
                }
                else if(ae.getSource()==b3)
                {
                   t1.resume();
                }
                else if(ae.getSource()==b4)
                {
                        t1.stop();
                }
        }
        public void run()
        {
                try
                {
Š                        while(true)
                        {
                                if(x>700)
                                {
                                        x=10;
                                }
                                repaint();
                                Thread.sleep(500);
                                
                        }
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
        }
        public void paint(Graphics g)
        {
                g.setColor(new Color(200,100,100));
                y=250;
                g.drawString(msg,x+=10,y);
        }
}Ex­ 1°         BARCHART

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.applet.Applet;

/*<applet code=chart width=300 height=300></applet>*/

public class chart extends Applet implements MouseMotionListener
{
  public void init()
  {
    addMouseMotionListener(this);
  }

  public void mouseMoved(MouseEvent e)
  {
     showStatus(""+e.getX()+","+e.getY());
  }
  public void mouseDragged(MouseEvent e)
  {
  }
  public void paint(Graphics g)
  {
     g.drawLine(105,265,435,265);
     g.drawLine(105,265,105,65);
     g.drawString("1996",140,296);
     g.drawString("1997",200,296);
     g.drawString("1998",260,296);
     g.drawString("1997",320,296);
     g.drawString("2000",380,296);
     g.drawString("100",80,245);
     g.drawString("110",80,225);
     g.drawString("120",80,205);
     g.drawString("130",80,185);
     g.drawString("140",80,165);
     g.drawString("150",80,145);
     g.drawString("160",80,125);
     g.drawString("170",80,105);
     g.drawString("180",80,85);
     g.fillRect(201,219,15,46);
     g.fillRect(265,136,15,129);
     g.fillRect(320,237,15,28);
     g.fillRect(379,76,15,189);
     g.drawString("( years )",218,318);
     g.drawString(" Turnover",10,114);
     g.drawString("(in Crores)",6,124);
     Font f= new Font("Sans Serif",Font.BOLD,16);
     g.setFont(f);
     g.drawString("XYZ COMPANY - ANNUAL REPORT",193,20);
   }
}
Eø­1±    PROGRAÍ FOÒ MARUTHÉ  CAÒ COMPANÙ USINÇ FRAMES

import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class cars extends Frame implements ActionListener
{
        Label l;
        Button b1,b2,b3,b4;
        public cars()
        {
                setLayout(null);
                Font f=new Font("Sans Serif",Font.BOLD,25);
                l=new Label("Details Of Cars");
                b1=new Button("800");
                b2=new Button("1000");
                b3=new Button("Esteem");
                b4=new Button("Zen");
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                setSize(800,600);
                setBackground(Color.pink);
                setForeground(Color.blue);
                l.setBounds(300,200,200,40);
                b1.setBounds(100,300,100,20);
                b2.setBounds(220,300,100,20);
                b3.setBounds(340,300,100,20);
                b4.setBounds(460,300,100,20);
                add(l);add(b1);add(b2);add(b3);add(b4);
        }
        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==b1)
                {
                        new code800().setVisible(true);
                        setVisible(false);
                        
                }
                else if(ae.getSource()==b2)
                {
                        new code1000().setVisible(true);
                        setVisible(false);
                }
                else if(ae.getSource()==b3)
                {
                        new codeesteem().setVisible(true);
                        setVisible(false);
                }
                else if(ae.getSource()==b4)
                {
                        new codezen().setVisible(true);
                        setVisible(false);
                }
        }
        public static void main(String ar[])
        {
                new cars().setVisible(true);
        }
}
Šclass code800 extends Frame implements ActionListener
{
        Label l1,l2,l3,l4,l5,l6;
        Button b;
        public code800()
        {
                setLayout(null);
                l1=new Label("Code :  ");
                l2=new Label("Car Model : ");
                l3=new Label("Price : ");
                l4=new Label("800");
                l5=new Label("Maruthi 800");
                l6=new Label("Rs.2,14,800");
                b=new Button("Ok");
                setSize(800,600);
                setBackground(Color.cyan);
               setForeground(Color.black);

            l1.setBounds(200,100,100,30);
            l4.setBounds(350,100,100,30);
            l2.setBounds(200,200,120,30);
            l5.setBounds(350,200,150,30);
            l3.setBounds(200,300,120,30);
            l6.setBounds(350,300,150,30);
            b.setBounds(300,400,60,30);
       add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(b);
       b.addActionListener(this);
       setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
                setVisible(false);
                new cars().setVisible(true);
        }
                
}
class code1000 extends Frame implements ActionListener
{
        Label l1,l2,l3,l4,l5,l6;
        Button b;
        public code1000()
        {
                setLayout(null);
                l1=new Label("Code :  ");
                l2=new Label("Car Model : ");
                l3=new Label("Price : ");
                l4=new Label("1000");
                l5=new Label("Maruthi 1000");
                l6=new Label("Rs.3,72,400");
                b=new Button("Ok");
                setBackground(Color.pink);
                setForeground(Color.blue);

                setSize(800,600);
                l1.setBounds(200,100,100,30);
                l4.setBounds(350,100,100,30);
                l2.setBounds(200,200,120,30);
                l5.setBounds(350,200,150,30);
                l3.setBounds(200,300,120,30);
                l6.setBounds(350,300,150,30);
                b.setBounds(300,400,60,30);
Š
         add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(b);
         b.addActionListener(this);
         setVisible(true);
       }
        public void actionPerformed(ActionEvent ae)
        {
                setVisible(false);
                new cars().setVisible(true);
        }
                
}
class codeesteem extends Frame implements ActionListener
{
        Label l1,l2,l3,l4,l5,l6;
        Button b;
        public codeesteem()
        {
                setLayout(null);
                l1=new Label("Code :  ");
                l2=new Label("Car Model : ");
                l3=new Label("Price : ");
                l4=new Label("Esteem");
                l5=new Label("Maruthi Esteem");
                l6=new Label("Rs.3,69,850");
                b=new Button("Ok");
                setSize(800,600);
                setBackground(Color.green);
                setForeground(Color.blue);

                l1.setBounds(200,100,100,30);
                l4.setBounds(350,100,100,30);
                l2.setBounds(200,200,120,30);
                l5.setBounds(350,200,150,30);
                l3.setBounds(200,300,120,30);
                l6.setBounds(350,300,150,30);
                b.setBounds(300,400,60,30);

                add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(b);
                b.addActionListener(this);
                setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
                setVisible(false);
                new cars().setVisible(true);
        }
                
}
class codezen extends Frame implements ActionListener
{
        Label l1,l2,l3,l4,l5,l6;
        Button b;
        public codezen()
        {
                setLayout(null);
                l1=new Label("Code :  ");
                l2=new Label("Car Model : ");
                l3=new Label("Price : ");
                l4=new Label("Zen");
                l5=new Label("Maruthi Zen");
Š                l6=new Label("Rs.3,91,920");
                b=new Button("Ok");
                setBackground(Color.blue);
                setForeground(Color.green);

                setSize(800,600);
                l1.setBounds(200,100,100,30);
                l4.setBounds(350,100,100,30);
                l2.setBounds(200,200,120,30);
                l5.setBounds(350,200,150,30);
                l3.setBounds(200,300,120,30);
                l6.setBounds(350,300,150,30);
                b.setBounds(300,400,60,30);

          add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(b);
          b.addActionListener(this);
          setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
                setVisible(false);
                new cars().setVisible(true);
        }
                
}
 
Ex-1´   PROGRAÍ FOÒ MOUSÅ LISTENEÒ IÎ FRAMES

import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class frame1 extends Frame implements MouseListener
{
        Label l1;
        Font f1,f2;
        public frame1()
        {
                setLayout(null);
                l1=new Label("Good Morning");
                f1=new Font("Times Roman",Font.BOLD,12);
                f2=new Font("Times Roman",Font.BOLD,28);
                setSize(800,600);
                setVisible(true);
                addMouseListener(this);
        }
        public void mouseEntered(MouseEvent me)
        {
                l1.setBounds(200,400,400,50);
                add(l1);
                l1.setFont(f2);
                setBackground(Color.yellow);
                l1.setBackground(Color.yellow);
                l1.setForeground(Color.red);
                
        }
        public void mouseExited(MouseEvent me)
        {

                l1.setBounds(200,400,400,50);
                l1.setFont(f1);
                setBackground(Color.pink);
                l1.setBackground(Color.pink);
                l1.setForeground(Color.black);
        }
        public void mouseClicked(MouseEvent me)
        {
        }
        public void mousePressed(MouseEvent me)
        {
        }
        public void mouseReleased(MouseEvent me)
        {
        }
        public static void main(String ar[])
        {
                new frame1();
        }
}
¯ EX-1µ  PROGRAÍ FOÒ CLIENÔ COMMUNICATIOÎ USINÇ DATAGRAÍ SOCKET 

Program-1
---------
import java.io.*;
import java.net.*;
public class Dclient
{
 public static void main(String ar[])throws Exception
 {
                DatagramSocket ds=new DatagramSocket();
                String s;
                DataInputStream d=new DataInputStream(System.in);
                DatagramPacket dp;
                while(true)
                {
                   s=d.readLine();
                   byte b[]=new byte[512];
                   b=s.getBytes();
                   dp=new DatagramPacket(b,b.length,InetAddress.
                                   getByName("localhost"),5000);
                        ds.send(dp);
                        if(s.equals("exit"))
                        break;
                }
        }
}

INPUÔ IÎ THÅ CLIENÔ SIDE

TYPÅ ANY MESSAGE
HAI

..PA
Š/¯ Ex-1µ PROGRAÍ FOÒ SERVEÒ COMMUNICATIOÎ USINÇ DATAGRAÍ SOCKET 

Program-2
--------- 
import java.io.*;
import java.net.*;

public class Dserver
{
        public static void main(String ar[])throws Exception
        {
                DatagramSocket ds=new DatagramSocket(5000);
                String s;
                DatagramPacket dp;
                while(true)
                {
                        byte b[]=new byte[512];
                        dp=new DatagramPacket(b,b.length);
                        ds.receive(dp);
                        s=new String(b).trim();
                        if(s.equals("exit"))
                        break;
                        System.out.println(s);
                }
        }
}
Š/¯ Ex-1µ PROGRAÍ FOÒ SERVEÒ COMMUNICATIOÎ USINÇ DATAGRAÍ SOCKET 

Program-2
--------- 
import java.io.*;
import java.net.*;

public class Dserver
{
        public static void main(String ar[])throws Exception
        {
                DatagramSocket ds=new DatagramSocket(5000);
                String s;
                DatagramPacket dp;
                while(true)
                {
                        byte b[]=new byte[512];
                        dp=new DatagramPacket(b,b.length);
                        ds.receive(dp);
                        s=new String(b).trim();
                        if(s.equals("exit"))
                        break;
                        System.out.println(s);
                }
        }
}
