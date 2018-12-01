/*
FileOutputStream::
=============
	Used for writing data to specified file.

Constructors:
===========
	
	FileOutputStream(String filename,boolean append) throws FilenotFoundException
Methods:
==========

	write() throws IOException.
	close() throws IOException.
*/
// Program that demonstrates Fileoutputstream.

import java.io.*;
class filecopydemo
{
	public static void main(String args[])
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
	try
	{
		fin = new FileInputStream(args[0]);
	}catch(FileNotFoundException e)
		{
		System.out.println(args[0]+" File Not Found ");	
		System.exit(0);
		}
	try
	{
	fout = new FileOutputStream(args[1],true);
	}catch(FileNotFoundException e)
		{
		System.out.println(args[1]+" File Creation Error ");
		System.exit(0);
		}
	while(true)
	{
	try
	{
		int data = fin.read();
		if(data == -1)
		{
			fin.close();
			fout.close();
			System.out.println("1 File Copied");
		break;
		}
	fout.write(data);
	}catch(IOException e){}
	}
}
}













