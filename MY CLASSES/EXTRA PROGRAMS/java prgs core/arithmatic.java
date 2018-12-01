import java.io.*;
class arithmatic
{
  public static void main(String args[])throws Exception
   {
     int i,a,b,s;
     DataInputStream ds=new DataInputStream(System.in);
     System.out.println("ARITHMATIC OPERATIONS");
     System.out.println("1.addition");
     System.out.println("2.subtraction");
     System.out.println("3.multiplication");
     System.out.println("4.division");
     System.out.println("5.modulo division");
     System.out.println("enter ur option");
     i=Integer.parseInt(ds.readLine());
     System.out.println("enter a number");
     a=Integer.parseInt(ds.readLine());
     System.out.println("enter a number");
     b=Integer.parseInt(ds.readLine());
     switch(i)
      {
        case 1: s=a+b;
                System.out.println("addition of a and b is"+s);
                break;
        case 2: s=a-b;
                System.out.println("subtraction of a and b is"+s);
                break;
        case 3: s=a*b;
                System.out.println("multiplication of a and b is"+s);
                break;
        case 4: s=a/b;
                System.out.println("division of a and b is"+s);
                break;
        case 5: s=a%b;
                System.out.println("modulo division of a and b is"+s);
                break;
        default: System.out.println("u r in default");
                 break;
      }
    }
 }

