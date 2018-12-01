package mypack.student;
public class Student
{
	public int sno;
	public String sname;

	public Student(int sno,String sname)
	{
		this.sno = sno;
		this.sname = sname;
	}
	
	public void s_id()
	{
		System.out.println("Student Roll Number.."+sno);
	}
	public void s_name()
	{
		System.out.println("Student Name.. "+sname);
	}
}