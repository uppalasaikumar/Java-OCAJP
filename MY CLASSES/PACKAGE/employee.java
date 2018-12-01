package mypack;
public class employee
{
	public int eno;
	public String ename;
	public employee(int eno,String ename)
	{
		this.eno = eno;
		this.ename = ename;
		
	}
	
	public void getid()
	{
		System.out.println("Employee id is:: "+eno);
		
	}
	public void getname()
	{
		
		System.out.println("Employee name is:: "+ename);
	}
}