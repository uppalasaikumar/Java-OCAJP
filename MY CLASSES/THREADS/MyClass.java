import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
class MyClass 
{
	public static void main(String[] args)throws Exception 
	{
		String drv = "oracle.jdbc.driver.OracleDriver";
		Class.forName(drv);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url,"hr","hr");
		System.out.println("Connected...");
		Thread.sleep(3000);
		con.close();
		System.out.println("Disconnected");
	}
}
