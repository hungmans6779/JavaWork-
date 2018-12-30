import java.net.*;
import java.io.*;
public class TCPEchoServer
{
 public static void main(String argv[])
 {
  try
  {
   ServerSocket srv=new ServerSocket(7);
   System.out.println("Echo server start at port : "+ 7);
   while(true)
   {
   	Socket clnt=srv.accept();
   	DataInputStream dataIn=new DataInputStream(new BufferedInputStream(clnt.getInputStream()));
   	DataOutputStream dataOut=new DataOutputStream(new BufferedOutputStream(clnt.getOutputStream()));
   	
   	System.out.println("Clinet connected from : "+clnt.getInetAddress());
   	String req=dataIn.readUTF();
   	String send=req.toUpperCase();
   	dataOut.writeUTF(send);
   	dataOut.flush();
   	dataIn.close();
   	dataOut.close();  	
   }	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	 
 }
}