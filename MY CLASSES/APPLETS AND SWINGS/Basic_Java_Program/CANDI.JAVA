// Implementing the concept of overriding methods

 class Appli
   {
    String appID;
    String appName;
    String appAddr;
    String appPosi;

    Appli()
      {
        appID ="100";
        appName = "Raja";
        appAddr = "Chennai";
        appPosi = "Engr";
      }
     void Disp()
       {
         System.out.println(appID);
         System.out.println(appName);
         System.out.println(appAddr);
         System.out.println(appPosi);
       }
   }
   class Candi extends Appli
     {
      String Int_date;

      Candi()
        {
         Int_date = "03-july-2001";
        }
      void Disp()
        {
         super.Disp();
         System.out.println(Int_date);
        }
     public static void main(String args[])
      {
         Candi Cobj = new Candi();
         Cobj.Disp();
      }
    }
     

        

