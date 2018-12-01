
// String manipulation using char Array.

class ex6
{
        public static void main(String ar[])
        {
                char c[]=new char[5];
                for(int i=0;i<5;i++)
                {
                        c[i]=(char)(65+i);
                }
                String s1=String.valueOf(c);
                System.out.println("From Char[] To String Is :"+s1);
                String s2=String.valueOf(c,2,3);
                System.out.println("From Char[] with Offset To String :"+s2);
        }
}

