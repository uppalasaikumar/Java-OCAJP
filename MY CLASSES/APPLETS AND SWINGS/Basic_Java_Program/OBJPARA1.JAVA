// Using objects as parameter

class Box
  {
    double width;
    double height;
    double depth;

    Box(Box ob)
      {
       width = ob.width;
       height = ob.height;
       depth = ob.depth;
      }
    Box()
      {
        width = -1;
        height = -1;
        depth = -1;
      }
    Box(double len)
      {
        width = height = depth = len;
      }
    Box(double w, double h, double d)
      {
        width = w;
        height = h;
        depth = d;
      }

    double volume()
       {
         return (width * height * depth);
       }
  }

  class objpara1
     {
       public static void main(String args[])
         {
           Box mybox1 = new Box(10,20,15);
           Box mybox2 = new Box();
           Box mycube = new Box(7);

           Box mycone = new Box(mybox1);
           double vol;

           vol = mybox1.volume();
           System.out.println("Volume of mybox1 is " + vol);

           vol = mybox2.volume();
           System.out.println("Volume of mybox2 is " + vol);

           vol = mycube.volume();
           System.out.println("Volume of cube is " + vol);

           vol = mycone.volume();
           System.out.println("Volume of cone is " + vol);
         }
    }



    
