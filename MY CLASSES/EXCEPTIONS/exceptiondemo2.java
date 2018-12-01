

package employee;
 import java.io.IOException;


public class Main {
    
    
    public Main() {
    }
  public static void main(String[] args) {
    try {
      System.out.println("In second try block in main()");
      System.in.read();
      return;
    } catch (IOException e) {
      System.out.println("I/O exception caught in main()");
    } finally {
      System.out.println("finally block for second try block in main()");
    }
    System.out.println("Code after second try block in main()");
  }
}
    
    

