import java.io.*;
class A
{
 public void process()
 {
  System.out.println("A, ");
 }
}
public class EXAME84
{
 public void process() throws IOException
 {
  super.process();
  System.out.print("B, ");
  throw new IOException();
 }
 public static void main(String argv[])
 {
 	try
 	{
 	 new EXAME84().process();	
 	}	
 	catch(IOException e)
 	{
 	 System.out.println("Exception");	
 	}	
 }	
}