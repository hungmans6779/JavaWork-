import java.io.*;
public class EX1_1
{
 public static void main(String argv[])
 {
 	System.out.print("�п�J�@�ӭ^��r�� : ");
 	try
 	{
   char c=(char)System.in.read();
   System.out.println("\n�z��J���^��r���� : "+c);
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }	
 }		 
}	