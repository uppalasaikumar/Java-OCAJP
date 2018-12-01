import java.lang.reflect.*;
import java.util.Scanner;
import java.util.*;

public class MethodInfo
{
  public static void main(String str[])
  {
	Scanner set = new Scanner(System.in);
	Class Obj = set.getClass();
	Method methods[] = Obj.getMethods();
	for (int i = 0; i < methods.length; i++) 
	{
		String methodName = methods[i].getName();
		System.out.println("Name: " + methodName);
String returnString = methods[i].getReturnType().getName();
		System.out.println("Return Type: " + returnString);
		Class parameters[] = methods[i].getParameterTypes();
		System.out.print("Parameter Types: ");
		for (int k = 0; k < parameters.length; k ++) 
		{
			String parameterName=parameters[k].getName();
			System.out.print(" " + parameterName);
		}
		System.out.println();
	}
 }
}

/*
Class obj = methods[i].getReturnType();
String paramname = obj.getName();
*/