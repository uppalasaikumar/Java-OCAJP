import java.io.*;

class Overload
{
    int print(int a,int b,int c)
	{
		System.out.println("Method with 3 arguments");
		return(a+b+c);
	}
	
     int print(int a,int b)
	{
		System.out.println("Method with 2 arguments from Overload class");
		return(a+b);
	}
}

class Override extends Overload  
{
     int print(int a,int b,int c)
	{
		System.out.println("Method with 3 arguments from Override class");
		return(a+b+c);
	}
	
     public static void main(String arg[])
	{
		Override ob=new Override();
		ob.print(2,3,4);
		ob.print(6,7);
		Overload ob1=new Overload();
		ob1.print(7,8,9);
	}
}
		