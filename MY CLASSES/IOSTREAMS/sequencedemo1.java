// Program that demonstrates Sequence Input Stream.

import java.io.*;
class sequencedemo1
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader dis = new BufferedReader(ir);
		System.out.println("Enter First File name :: ");
		String file1 = dis.readLine();
		FileInputStream fin1 = new FileInputStream(file1);
		System.out.println("Enter Second File Name :: ");
		String file2 = dis.readLine();
		FileInputStream fin2 = new FileInputStream(file2);
		FileOutputStream fout = new FileOutputStream("I:\\MyData.txt",true);
		SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
		while(true)
		{
			int data = sis.read();
			if(data == -1)
			{
				fin1.close();
				fin2.close();
				fout.close();
				sis.close();
			break;
			}
		fout.write(data);
		}
	}
}