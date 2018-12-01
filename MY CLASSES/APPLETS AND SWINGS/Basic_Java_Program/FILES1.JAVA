import java.io.*;
class files1
{
   public static void main(String ar[])
    {
      int s;
      String s1,s2;
      try
       {
        File f=new File("out1.txt");
        FileReader f1=new FileReader(f);
        PrintWriter pw1=new PrintWriter(new FileWriter("out1.txt"),true);
        DataInputStream d=new DataInputStream(System.in);                        
        do
         {
          System.out.println("    Menu       ");
          System.out.println("1. Writing ");
          System.out.println("2. Reading ");
          System.out.println("3. Exit        ");
          System.out.println("Enter Ur Choice ");
          int op=Integer.parseInt(d.readLine());
          switch(op)
           {
            case 1:
                   System.out.println("Enter The Data to Write");
                   s1=d.readLine();
                   pw1.println(s1);
                   break;
            case 2:
                   int x;
                   char ch;
                   System.out.println("The Content From The File is");
                   while((x=f1.read())!=-1)
                  {
                   ch=(char)x;
                   System.out.print(ch);
                  }
                   break;
                                                
           case 3:
                  System.exit(0);
             }
                  System.out.println("Do U want to Continue  1/0");
                  s=Integer.parseInt(d.readLine());
                  }while(s!=0);
                }
                catch(Exception e)
                {
                        System.out.println(e);
                }
        }
}





