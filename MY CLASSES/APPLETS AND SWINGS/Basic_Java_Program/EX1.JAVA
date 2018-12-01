
// Finding area and perimeter of a circle. Use Buffered Reader class.

import java.io.*;
class ex1
{
   public float area(int r)
    {
     return(3.14f*r*r);
    }
   public float perimeter(int r)
    {
     return (2*3.14f*r);
    }
   public static void main(String ar[])
    {
     ex1 e1=new ex1();
     try
      {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the redius of The Circle");
       int r=Integer.parseInt(br.readLine());
       float f1=e1.area(r);
       float f2=e1.perimeter(r);
       System.out.println("Area of Circle : "+f1);
       System.out.println("Perimeter of Circle : "+f2);
      }
      catch(Exception e)
      {
       System.out.println(e);
      }
   }
}



