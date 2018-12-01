
// Usage of calender class and manipulation.

import java.util.*;
class ex5
{
        public static void main(String ar[])
        {
                Calendar c1=Calendar.getInstance();
                System.out.println("Date : ");
                System.out.print(c1.get(Calendar.MONTH)+" : ");
                System.out.print(c1.get(Calendar.DATE)+" : ");
                System.out.print(c1.get(Calendar.YEAR));
                System.out.println( );
                System.out.println("Time : ");
                System.out.print(c1.get(Calendar.HOUR)+" : ");
                System.out.print(c1.get(Calendar.MINUTE)+" : ");
                System.out.print(c1.get(Calendar.SECOND));

        }
}

