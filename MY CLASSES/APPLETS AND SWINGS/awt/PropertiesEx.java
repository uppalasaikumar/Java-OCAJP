 import java.util.*;
import java.io.*;
class PropertiesEx 
{
public static void main(String[] args)throws Exception 
	{
	Properties p=new Properties();
FileInputStream fis=
	new FileInputStream("abc.properties");
		p.load(fis);
		
		System.out.println(p);
String s=p.getProperty("chiru");
		System.out.println(s);
	p.setProperty("chiru","1111");
FileOutputStream fos=
new FileOutputStream("abc.properties");
p.store(fos,"updated by sathish");

	}
	}
