//PROGRAM THAT DEMONSTRATES BLANK IMPLEMENTATION.

package abstractdemo1;
import java.io.*;
abstract class antena
{
        abstract void transmit();
        abstract void receive();
       
}
class tvantena extends antena
{
       void receive()
       {
           System.out.println("Receives digital signals");
       }
       void transmit()
       {
          //Blank implementation of code. 
       }
}
class dishantena extends tvantena
{
    void transmit()
    {
           System.out.println("Transmits Electronic - Tv signals");
    }
    
}
public class abstractdemo1{
    
    public static void main(String[] args) {
        tvantena t1 = new tvantena();
        t1.receive();
        t1.transmit();
        dishantena d1 = new dishantena();
        d1.transmit();
        d1.receive();
    }
    
}
