import java.io.*;
public class EXAME99
{
 public static void main(String argv[])
 {
  BufferedReader buffReader=null;
  try
  {
   String tmp;	
   while(tmp=bufferReader.readLine()!=null)
   {
    System.out.println(tmp);	
   }	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}