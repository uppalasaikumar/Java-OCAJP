/*
//An abstract class is a class with abstract methods. 

//The abstract methods are methods declared with abstract keyword and do 
not have any body.

//It is to be implemented.

//Since the class contains abstract methods the class itself has to be 
declared with abstract keyword.

//Abstract methods are defined in such cases where the exact implementation 
of the method is not known at super class level.
 
// For abstract classes we cannot create dynamic memories.

-- Abstract classes are created when there is a compulsory need of
providing defintions for 
abstract methods in sub classes.
-- in few cases there will be a need of providing defintions for the 
absract methods in sub classes

-- Class which consists of defined and declared methods both, is also called as abstract class
-- basically class which consists of declared methods or absract 
methods is called as absract class. For a abstract class we cannot
create an object because declared methods are available 
in the class

-- If a class which consists of all defined methods and if do not want to
create an object for the class then we can create the same class 
as abstract by just providing 'abstract' keyword before class name.

-- If we want to implement only few abstract methods but not all in any 
sub class then just have blank definitions for all the other abstract 
methods for which definitions are not available.
//========================================================================================================================== */
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
class abstractdemo {
     
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

