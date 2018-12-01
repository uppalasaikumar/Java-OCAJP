import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
class ReflectionEx 
{
public static void main(String[] args)throws Exception 
	{//class object
Class cls=
Class.forName("java.lang.String");
//class info
System.out.println("Fully Qualified class Name:"+cls.getName());
System.out.println("class name with out the package name"+cls.getSimpleName());

//package info
System.out.println
	("Package Name: "+cls.getPackage());

//SuperClassname
System.out.println
("Super class name:"+cls.getSuperclass());

//constructors

Constructor[] cons=cls.getConstructors();
for(Constructor cons1:cons)
		{
	System.out.println(cons1);
		}
System.out.println("No of constructors :"+cons.length);

	//methods info
	Method[] m=cls.getMethods();
	for(Method m1:m)
		{
System.out.println(m1);
		}
System.out.println(" No of Methods are :"+m.length);

		
	}
}
