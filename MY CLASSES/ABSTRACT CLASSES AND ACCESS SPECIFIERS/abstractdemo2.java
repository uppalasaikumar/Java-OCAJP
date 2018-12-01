import java.io.*;
abstract class animal
{
        abstract void move();
        abstract void feed();
        void breath()
        {
                System.out.println("Animals breath Oxygen");
        }
 }
class tiger extends animal
{
        void move()
        {
                System.out.println("tiger Moves on four legs");
        }
        void feed()
        {
                System.out.println("Tiger feed of other animals");
                
        }
        
}
class snake extends animal
{
        void move()
        {
            System.out.println("Snake screeps");
            
        }
        void feed()
        {
            System.out.println("snake feed on other small snakes and small animals");
        }
}

public class abstractdemo2 {
     
    public static void main(String args[]) {
       tiger t1 = new tiger();
       t1.move();
       t1.feed();
       t1.breath();
       snake s1 = new snake();
       s1.move();
       s1.feed();
       s1.breath();
    
        
    }

    }