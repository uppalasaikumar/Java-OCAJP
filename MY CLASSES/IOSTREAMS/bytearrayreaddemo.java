/*
ByteArrayInputStream:
===============
	Used to handle array of bytes.It can convert the array and provide the input stream to read from it.

Constructor;
===========
ByteArrayInputStream(byte[])

Methods:
===========
read() throws IOException
close() throws IOException
*/
// Program that demonstrates ByteArrayInputStream.

import java.io.*;
class bytearrayreaddemo
{
	public static void main(String args[]) throws Exception
	{
	DataInputStream dis = new DataInputStream(System.in);
	System.out.println("Enter String...");
		String s = dis.readLine();
		byte b[] = s.getBytes();
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
	System.out.println("Enter a FileName...");
	FileOutputStream fout = new FileOutputStream(dis.readLine());
		while(true)
		{
			int data = bis.read();
			if(data == -1)
			{
			fout.close();
			bis.close();
			break;
			}
			fout.write(data);
		}
}
}
	
