
// Database creation for storing e-mail addresses and manipulation.

import java.io.*;
import java.sql.*;
class email
 {
  public static void main(String ar[])
   {
    int s;
    try
     {
      Connection con;
      PreparedStatement ps,ps1;
      ResultSet rs;
      DataInputStream d=new DataInputStream(System.in);
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con=DriverManager.getConnection("jdbc:odbc:kkk","krish","kishore");
      do
       {
        System.out.println("    Menu       ");
        System.out.println("1. Add Address ");
        System.out.println("2. Display     ");
        System.out.println("3. Exit        ");
        System.out.println("Enter Ur Choice ");
        int op=Integer.parseInt(d.readLine());
        switch(op)
         {
           case 1:
                   System.out.println("Enter The Email Address");
                   String em=d.readLine();
                   ps=con.prepareStatement("insert into emailadd values(?)");
                   ps.setString(1,em);
                   int t=ps.executeUpdate();
                   System.out.println(t +"records added into Database");
                   break;
           case 2:
                   ps1=con.prepareStatement("select * from emailadd");
                   rs=ps1.executeQuery();
                   System.out.println("Email Address ");
                   while(rs.next())
                    {
                     System.out.println(rs.getString(1));
                    }
                    break;
           case 3:
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




