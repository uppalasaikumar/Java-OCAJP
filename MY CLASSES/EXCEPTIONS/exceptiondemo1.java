

package employee;


public class exceptiondemo1{
  
    
    public static void main(String[] args) {
       int[] x = { 10, 5, 0 };
    try {
      System.out.println("First try block in main() entered");
      divide(x, 1);
      x[1] = 0;
      divide(x, 0);
      x[1] = 1;
      divide(x, 1);
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic exception caught in main()");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index-out-of-bounds exception caught in main()");
    }
  }
  private static void divide(int[] intArray, int j) {
    for (int i : intArray) {
      System.out.println(i);
      System.out.println(j);
      System.out.println(i / j);
      System.out.println();
    }
    }
    
}
