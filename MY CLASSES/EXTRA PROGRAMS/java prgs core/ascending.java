/*
   priyanka
  
  ROLL NUMBER: 08AT5A0501					DATE:2-1-2009
  NAME: SUDHAKAR						EXERCISE NUMBER:3(b)

  WRITE A JAVA PROGRAM FOR SORTING A GIVEN LIST OF NAMES IN ASCENDING 
  ORDER*/   


class ascending
{
  public static void main(String args[])
    {
       String str[]={"susmitha","lavanya","priyanka","praveena"};
       for(int i=0;i<str.length-1;i++)
        {
          for(int j=i+1;j<=str.length-1;j++)
            {
              if(str[i].compareTo(str[j])>0)
                {
                   String t=str[j];
                   str[j]=str[i];
                   str[i]=t;
                }
             }
         }
       for(int j=0;j<str.length;j++)
         System.out.println(str[j]);
    }
}
 */OUTPUT

/*C:\SUDHAKAR>java ascending
    lavanya
    praveena
   susmitha
/*
