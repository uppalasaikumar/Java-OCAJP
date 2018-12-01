import java.io.*;
public class ex9b
{
   DataInputStream dis=new DataInputStream(System.in);
   public static void main(String args[])
    {
     ex9b e1=new ex9b();
     DataInputStream d=new DataInputStream(System.in);
     try
      {
       String s1="";
       do
        {
         System.out.println("Exceptions");
         System.out.println("1: IO/ArrayIndexOutOfBoundsException");
         System.out.println("2: FileNotFoundException");
         System.out.println("3: ArithematicExceptions");
         System.out.println("4: Exit");
         System.out.println("Enter  Ur Choice 1/2/3/4");
         int u=Integer.parseInt(d.readLine());
         switch(u)
          {
           case 1:  e1.ioarray();
                    break;
           case 2:  e1.files();
                    break;
           case 3:  e1.arithmatic();
                    break;
           case 4:  e1.exit();
                    break;
          }
         System.out.println("Do U want To Continue n/y");
         s1=d.readLine();
         }while(s1.equalsIgnoreCase("y"));
         }
         catch(Exception e)
          {
           System.out.println(e);
          }
        }
        public void files()
        {

         try
          {
           System.out.println("Enter the File name");
           String s=dis.readLine();
           File f=new File(s);
           FileReader fr=new FileReader(f);
           if(f.isFile())
            {
             System.out.println("**********");
            }
           }
            catch(FileNotFoundException e)
            {
             System.out.println("File Not Found Exception");
            }
             catch(Exception e)
            {
             System.out.println("Exception :"+e);
            }
            }
        public void arithmatic()
        {
                try
                {
                        int a=0;
                        System.out.println(a);
                        int b=45/a;
                }
                catch(ArithmeticException e)
                {                   
                        System.out.println("Arithmatic Exception ");
                }
        }
        public void ioarray()
        {
                try
                {
                        System.out.println("Enter the Size of Ur Array");
                        int n=Integer.parseInt(dis.readLine());
                        int c[]=new int[n];
                        System.out.println("Enter the Elements for Ur Array");
                        for(int i=0;i<n;i++)
                        {
                                c[i]=Integer.parseInt(dis.readLine());
                        }
                        System.out.println("Our Passed Elements");
                        for(int i=0;i<=n;i++)
                        {
                                System.out.println(c[i]);
                        }


                }
                catch(IOException e)
                {
                        System.out.println("  IOEXception ");
                }
                catch(NumberFormatException e)
                {
                        System.out.println("  Number Format Exception ");
                    
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                        System.out.println(" ArrayIndexOutOfBoundsException ");
                    
                }
        }
        public void exit()
        {
                System.exit(0);
        }
}

