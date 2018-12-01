class Student 
{
	int rollno;

	Student(int rollno1)
	{
	this.rollno=rollno1;
	}

	public int hashCode()
	{
		return rollno;
	}
}
class Test
{
	public static void main(String[] args) 
	{
	Student s1=new Student(100);
	Student s2=new Student(101);

System.out.println(s1);
System.out.println(s2);

	}
}
