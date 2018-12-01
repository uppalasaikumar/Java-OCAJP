// demonstration of 'throws' keyword

import java.io.*;
class throwsdemo
{
	public static void main(String args[])throws IOException
	{
	DataInputStream dis = new DataInputStream(System.in);
	
	System.out.println("Enter a value..");
	int i = Integer.parseInt(dis.readLine());
	
	System.out.println("Enter another value...");

	int j = Integer.parseInt(dis.readLine());
	
	int sum = i + j;

	System.out.println("Sum is ... " +sum);

	}
}

	
		