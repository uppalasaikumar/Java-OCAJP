//Exception Example

class Exdemo
{
public static void main(String args[]) 
{
try{
int n=args.length;
System.out.println("The value in n = "+n);
int a=45/n;
System.out.println("The value in a = "+a);

}
catch(ArithmeticException e)
{
	System.out.println("======================");
	System.out.println("Arithemetic Exception Raised..");
	System.out.println("Please Enter values at command line..");
	System.out.println("======================");
}

	finally{
		System.out.println("This block will execute compulsorily...");
		System.out.println("Need for closing the files..");
	try{
		int arr[] = {23,52,45,21,45};
		arr[50] = 100;// cannot pass a value at index postion 50
	    }
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("======================");
	System.out.println("Array Index is full..");
	System.out.println("cannot insert value at the index specified..");
	System.out.println("======================");
	}
		

	        }
}
}





 












