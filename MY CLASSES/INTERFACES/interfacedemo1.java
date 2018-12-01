//Program that demonstrates the inheritance between interfaces.

interface a 
{
    void showa();
	
}
interface b extends a
{
    void showb();
}
interface c extends b
{
    void showc();
}
class impl implements c
{
    public void showa()
    {
           System.out.println("Method of --->a");
    }
    public void showb()
    {
        System.out.println("Method of --->b");
    }
    public void showc()
    {
        System.out.println("Method of ---->c");
    }
	public static void main(String args[])
	{
		impl i1 = new impl();
       		 i1.showa();
       		 i1.showb();
      		  i1.showc();
	}
}
