/*
Sequence Input Streams:
================
	Used to read from two InputStreams. Once the end of the first /*
Input stream is reached SequenceInputStream will read the second Inputstream.

Constructor:
=========
	SequenceInputStream(FileInputstream);

Methods:
========
	read() throws IOException
	write() throws IOException
===========================================================
*/
// Program that demonstrates Sequence Input Stream.

import java.io.*;
import java.util.Scanner;
class sequencedemo
{
	public static void main(String args[]) throws Exception
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First file --> ");
		FileInputStream fin1 = new FileInputStream(s.next());//D://filename1.txt
		System.out.println("Enter Second file --> ");
		FileInputStream fin2 = new FileInputStream(s.next());//D://filename2.txt
		System.out.println("Enter Output file --> ");
		FileOutputStream fout = new FileOutputStream(s.next());//D://outputfile.txt
		SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
		while(true)
		{
			int data = sis.read();
			if(data == -1)
			{
				fin1.close();
				fin2.close();
				sis.close();
			break;
			}
		fout.write(data);
		}
	}
}

