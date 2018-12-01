//Program that demonstrates FileInputStream.

/* There is a class in io package to read the data from a file character by charecter.
	This is possible by a class named as 'FileInputStream'

Constructors:
-----------
	FileInputStream(String filename) throws FileNotFoundException

methods:
--------
	read() throws IOException --> used to read the data from the file character by character and when any character is 
	taken from the file then it will be treated to be as an ASCII value integer equivalent.

	close() thorws IOException --> used to close opened files

*/

import java.io.*;
class fileread
{
	public static void main(String args[])
{
	FileInputStream fin = null;
	
	try
	{	
		fin = new FileInputStream(args[0]);
		
	}catch(FileNotFoundException e)
	{	
		System.out.println(args[0]+" File Not Found ");
		
	System.exit(0);
	}
	
	while(true)
	{	
	try
	{	
	int data = fin.read();// This is naresh technologies	
	if(data == -1)
	{
	fin.close();
	break;
	}
	System.out.print((char)data);
	}catch(IOException e){}
	}
}
}
