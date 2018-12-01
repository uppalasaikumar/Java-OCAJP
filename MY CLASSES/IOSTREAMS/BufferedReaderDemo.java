import java.io.*;
class BufferedReaderDemo 
{
	public static void main(String[] args) 
	{
		try 
		{	FileReader f1 = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(f1);
			String str;
			while ((str = br.readLine()) != null) 
			{
				System.out.println(str);
			}
		} catch (IOException e) {}
	}
}
