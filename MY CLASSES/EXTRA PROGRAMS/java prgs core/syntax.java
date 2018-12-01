import java.io.*;
class syntax
{
  public static void main(String args[])throws Exception
   {
     int choice;
     DataInputStream ds=new DataInputStream(System.in);
     
     do
      {
        System.out.println("MENU");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("3.while");
        System.out.println("4.do....while");
        System.out.println("5.for...");
        System.out.println("enter ur choice");
        choice=(char)System.in.read();

      }
      while(choice< '1' || choice > '5');
      switch(choice)
      {
         case '1': System.out.println("IF");
                 System.out.println("if(condition) statements");
                 System.out.println("else statements");
                 break;
         case '2': System.out.println("SWITCH");
                 System.out.println("switch(expression)");
                 System.out.println("case 1: statements;break");
                 System.out.println("case 2: statements;break");
                 System.out.println("case n: statements;break");
                 System.out.println("default: statements;break");
                 break;
         case '3': System.out.println("WHILE");
                 System.out.println("while(expression)");
                 System.out.println("statements block");
                 System.out.println("increment/decrement");
                 break;
         case '4': System.out.println("DO....WHILE");
                 System.out.println("do  ");
                 System.out.println("statements block");
                 System.out.println("increment/decrement");
                 System.out.println("while(condition);");
                 break;
         case '5': System.out.println("FOR...");
                 System.out.println("for(initialization;condition;increment/decrement");
                 System.out.println("statements block");
                 break;
         default: System.out.println("u entered invalid choice");
                  break;
      }
   }
}

