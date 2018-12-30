import java.io.*;
public class InputStreamTest1
{
 public static void main(String argv[])
 {
 	System.out.print("請輸入一個字串 : ");
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  String str;
  try
  {
   str=bin.readLine();
   System.out.println("您輸入的字串是 : "+str);
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	 
 }
}