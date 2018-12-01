public class boxingdemo{
    public static void main(String[] argv){

        Integer y = new Integer(567);    
        int x = y.intValue();            
        x++;                             
        y = new Integer(x);              
        System.out.println("y = " + y.intValue());  
        
        //with new and improved Java 5 you can say
        
        y = new Integer(567);    
        y++;                             
                                         
        System.out.println("y = " + y);  
    }
}