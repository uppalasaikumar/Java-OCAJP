
//Program that demonstrates interface.

interface mouse
{
       void click();
       void dbclick();
       
}
class desktop implements mouse
{
    public void click()
    {
        System.out.println("Selects Clicked Ickon");
    }
    public void dbclick()
    {
        System.out.println("Opens the double clicked Ickon");
    }
}
public class interfacedemo {
    
    public static void main(String[] args) {
	mouse m1 = new mouse();
        desktop d1 = new desktop();
        d1.click();
        d1.dbclick();
    }
    
}
