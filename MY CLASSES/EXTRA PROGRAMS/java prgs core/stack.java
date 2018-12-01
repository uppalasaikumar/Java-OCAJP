

import java.util.Stack;
import java.util.EmptyStackException;

class stack
{
  static void displaypush(Stack stk,int a)
   {
       stk.push(new Integer(a));
       System.out.println("Stack:"+stk);
   }
  
  static void displaypop(Stack stk)
   {
       stk.pop();
       System.out.println("Stack:"+stk);
   }
  
  public static void main(String org[])
   {
       Stack stk=new Stack();
       displaypush(stk,38);
       displaypush(stk,47);
       displaypush(stk,12);
       displaypop(stk);
       displaypop(stk);
       displaypop(stk);
       
       try
        {
           displaypop(stk);
        }
       
       catch(EmptyStackException e)
        {
          System.out.println("Stack is empty");
        }
    }
 }



/*$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                       INPUT/OUTPUT
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/

	
	Stack:[38]
	Stack:[38, 47]
	Stack:[38, 47, 12]
	Stack:[38, 47]
	Stack:[38]
	Stack:[]
	Stack is empty
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$*/
