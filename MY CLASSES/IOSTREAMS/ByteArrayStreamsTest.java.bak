import java.io.*;
class ByteArrayStreamsTest
{
	public static void main(String rags[]) throws Exception
	{
		// dynamic byte array
		byte b1[]={-128, -1, 0, 1, 127};
		ByteArrayInputStream bais=new ByteArrayInputStream(b1);
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		int i=bais.read();
		while(i!=-1)
		{
			baos.write(i);
			i=bais.read();
		}
		byte b2[]=baos.toByteArray();
		int len=b2.length;
		for(int j=0;j<len;j++)
		{
			System.out.print("\t"+b2[j]);
		}
	}
}
/*byte[] toByteArray(): Creates a newly allocated byte array.*/
