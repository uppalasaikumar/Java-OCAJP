import java.util.*; import java.io.*; import java.net.*;
public class ChattingClientA{
  public static void main(String[] args)throws Exception{
//prepare scanner to read input from keyboard
   Scanner scanf = new Scanner(System.in);
   System.out.printf("\nTrying to Connect to Server");
   Socket cs = new Socket("localhost",9098);
   System.out.printf("\n connected to the server");
   //prepare Scanner to read msg from server
    InputStream in = cs.getInputStream();
    Scanner sc = new Scanner(in);
   //prepare printStream to send msg to server
    OutputStream out = cs.getOutputStream();
    PrintStream ps = new PrintStream(out);
    String rmsg="";//to hold received msg
    String smsg="";//to hold sending msg   
    while(rmsg.equalsIgnoreCase("bye")==false){
      System.out.printf("\n enter msg to send to the server:");   
      smsg = scanf.nextLine();
      ps.println(smsg);//sending to the server
      System.out.printf("\nwaiting for msg from server....");
      rmsg = sc.nextLine();
      System.out.printf("\nmsg from server="+rmsg);
    }
    ps.println("bye");//sending bye to server
// close all
 in.close(); ps.close(); out.close(); cs.close();  } }
