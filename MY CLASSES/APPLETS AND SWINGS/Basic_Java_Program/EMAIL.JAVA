import java.io.*;
import java.sql.*;
class email
{  public static void main(String ar[])  {
   int s;
   String nm,em;
   int t;
   try
    {
     Connection con;
     PreparedStatement ps,ps1;
     ResultSet rs;
     DataInputStream d=new DataInputStream(System.in);
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con=DriverManager.getConnection("jdbc:odbc:raj","scott","tiger");
     do
      {
       System.out.println("    Menu       ");
       System.out.println("1. Add Address ");
       System.out.println("2. Update      "); 
       System.out.println("3. Display     ");
       System.out.println("4. Exit        ");
       System.out.println("Enter Ur Choice ");
       int op=Integer.parseInt(d.readLine());
       switch(op)
          {
            case 1:
                   System.out.println("Enter Your Name :");
                   nm=d.readLine();
                   System.out.println("Enter The Email Address");
                   em=d.readLine();
                   ps=con.prepareStatement("insert into rajtab values(?,?)");
                   ps.setString(1,nm);
                   ps.setString(2,em);
                   t=ps.executeUpdate();
                   System.out.println(t +"records added into Database");
                   break;
            case 2:
                   System.out.println("Enter Your Name To Change Your Emailid ");
                   nm=d.readLine();
                   System.out.println("Enter Your New Emailid ");
                   em=d.readLine();
                   ps=con.prepareStatement("update rajtab set eadr=? where enmae=?");
                   ps.setString(1,em);
                   ps.setString(2,nm);
                   t=ps.executeUpdate();
                   if(t>0)
                     System.out.println("Your mailid is updated into database");
                   else
                     System.out.println("Your Mailid is not updated into database");
                   break;
                                                
            case 3:
                   ps1=con.prepareStatement("select * from rajtab");
                   rs=ps1.executeQuery();
                   System.out.println("Name         Email Address ");
                   while(rs.next())
                     {
                      System.out.println(rs.getString(1)+"            "+rs.getString(2));
                     }
                   break;
            case 4:
                   System.exit(0);
           }
                   System.out.println("Do U want to Continue  1/0");
                   s=Integer.parseInt(d.readLine());
                   }while(s!=0);
             }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
    }





