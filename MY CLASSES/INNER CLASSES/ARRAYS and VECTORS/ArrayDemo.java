public class ArrayDemo
{
	public static void main(String arg[])
	{

		int arr[]; //Array Declaration

		arr=new int[10]; //Allocating memory to an array

		for(int i=0;i<10;i++) 	//initializing the array
		{
			arr[i]=i+2;
		}

		for(int i=0;i<10;i++) //Displaying the values of an array
		{
			System.out.println("Arr["+i+"]="+arr[i]);
		}

	}
}

	