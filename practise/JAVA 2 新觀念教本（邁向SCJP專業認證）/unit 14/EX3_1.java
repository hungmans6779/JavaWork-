import java.io.*;
public class EX3_1
{
 public static void main(String argv[]) 
 {
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  System.out.print("請輸入一個字串 : ");
  try
  {
   String input=bin.readLine();
   System.out.println("您輸入的字串是 : "+input);
   bin.close();	
   in.close();	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  } 
 }
}