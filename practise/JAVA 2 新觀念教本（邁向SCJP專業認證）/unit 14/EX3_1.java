import java.io.*;
public class EX3_1
{
 public static void main(String argv[]) 
 {
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  System.out.print("�п�J�@�Ӧr�� : ");
  try
  {
   String input=bin.readLine();
   System.out.println("�z��J���r��O : "+input);
   bin.close();	
   in.close();	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  } 
 }
}