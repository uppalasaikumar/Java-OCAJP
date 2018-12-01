import java.io.*;
import java.util.*;

class emp
{
        void empm()
        {
                System.out.println("This is Object of Emp");
                System.out.println("**********************");
        }
       
}
class student
{
        void studentm()
        {
            System.out.println("This is Object of student");
        }
}
public class vectordemo2{
       
    public static void main(String args[]) {
        Vector v = new Vector();
        emp e1 = new emp();
        student s1 = new student();
        v.addElement(e1);
        v.addElement(s1);
        emp e = (emp)v.firstElement();
        student s = (student)v.lastElement();
        e.empm();
        s.studentm();
    
        
    }

    }
		