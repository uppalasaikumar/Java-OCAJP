import java.util.*;
import java.io.*;
import java.net.*;
public class ChattingServerA{
  public static void  main(String[] args)throws Exception{
  ServerSocket s=new ServerSocket(9098);
  System.out.println("wainting for client request @ port num 9098");
  Socket ss = s.accept();
  System.out.println("connected to client");
  //prepare scanner to read msgs from client
   InputStream in = ss.getInputStream();
   Scanner sc = new Scanner(in);
   //prepare printStream to send msg to the client
    OutputStream out = ss.getOutputStream();
    PrintStream ps = new PrintStream(out);  
   //prepare scanner to read text from keypad
   Scanner scanf = new Scanner(System.in);
   String smsg="";//to hold sending msg
   String rmsg="";//to hold receving msg
  System.out.printf("\n wating for msg from client...");  
  rmsg =sc.nextLine();//reading msg from client
  while(rmsg.equalsIgnoreCase("bye")==false){
    System.out.printf("\nmsg from client:"+rmsg);
    //read msg to send to client
  System.out.printf("\nEnter msg to send to client:");
    smsg = scanf.nextLine();
    //send it to client
    ps.println(smsg);
  System.out.printf("\n wating for msg from client...");  
  rmsg =sc.nextLine();//reading msg from client
  }
  System.out.printf("\n msg from client:"+rmsg);//displaying bye
  ps.println("bye");//sending bye to client
  in.close();
  ps.close();
  out.close();
  ss.close();
  }
}