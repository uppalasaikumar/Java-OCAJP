class break1
{
public static void main(String args[])
 {
   for(int i=0;i<3;i++)
    {
      System.out.println("phase="+i+" ");
      for(int j=0;j<100;j++)
      {
        if(j==10)
          break;
            System.out.println(j+" ");
      }
    }
  System.out.println("loop complete");
 }
}

