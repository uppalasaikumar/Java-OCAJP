import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
class LocaleEx 
{
public static void main(String[] args) 
	{
Locale l=new Locale("uk","UK");
DateFormat df=
	DateFormat.getDateInstance(3,l);
System.out.println
	(df.format(new Date()));
	}
}
