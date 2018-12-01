// Using objects as parameters

class Test
   {
    int a,b;
    Test(int i, int j)
      {
        a=i;
        b=j;
      }
 boolean equals(Test o)
   {
     if(a == o.a && b == o.b)
        return true;
     else
       return false;
   }
 }


 class objpara
     {
       public static void main(String args[])
         {
           Test ob1 = new Test(5,7);
           Test ob2 = new Test(5,7);
           Test ob3 = new Test(-1,-1);

           System.out.println("ob1 == ob2: " + ob1.equals(ob2));
           System.out.println("ob1 == ob3: " + ob1.equals(ob3));
        }
      }



