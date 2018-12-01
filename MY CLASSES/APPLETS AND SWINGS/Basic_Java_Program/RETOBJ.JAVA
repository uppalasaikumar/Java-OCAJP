// Using returning objects

 class Test
   {
     int a;
     Test(int i)
       {
        a = i;
       }
     Test increase()
       {
        Test temp = new Test(a+100);
        return(temp);
       }
    }

   class retobj
     {
      public static void main(String args[])
        {
         Test ob1 = new Test(2);
         Test ob2;

         ob2 = ob1.increase();
         System.out.println("ob1.a " + ob1.a);
         System.out.println("ob2.a " + ob2.a);

         ob2 = ob2.increase();
         System.out.println("ob2.a after second increase " + ob2.a);
       }
    }


