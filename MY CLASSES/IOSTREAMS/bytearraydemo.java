// Program that demonstrates ByteArrayInputStream.

import java.io.*;
class bytearraydemo
{
	public static void main(String args[]) throws Exception
	{
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Enter a String.... \n");
		String s = din.readLine();
		System.out.println("---------------------------------------------");
		byte b[] = s.getBytes();
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		System.out.println("Enter a file name to transfer data...");
		FileOutputStream fout = new FileOutputStream(din.readLine(),true);
		System.out.println("The String value is.... " );
		System.out.println("===============");
		while(true)
		{
			int data = bis.read();
			if(data == -1)
			{
				System.out.println("FILE COPIED.....");
				bis.close();
				fout.close();
				break;
			}
			System.out.print((char)data);
			fout.write(data);
			
		}
			
}
}