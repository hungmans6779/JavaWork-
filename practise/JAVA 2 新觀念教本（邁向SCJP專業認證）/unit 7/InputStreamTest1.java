import java.io.*;
public class InputStreamTest1
{
 public static void main(String argv[])
 {
 	System.out.print("�п�J�@�Ӧr�� : ");
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  String str;
  try
  {
   str=bin.readLine();
   System.out.println("�z��J���r��O : "+str);
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	 
 }
}