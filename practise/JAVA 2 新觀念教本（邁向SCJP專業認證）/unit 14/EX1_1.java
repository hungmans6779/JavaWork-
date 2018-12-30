import java.io.*;
public class EX1_1
{
 public static void main(String argv[])
 {
 	System.out.print("請輸入一個英文字母 : ");
 	try
 	{
   char c=(char)System.in.read();
   System.out.println("\n您輸入的英文字母為 : "+c);
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }	
 }		 
}	