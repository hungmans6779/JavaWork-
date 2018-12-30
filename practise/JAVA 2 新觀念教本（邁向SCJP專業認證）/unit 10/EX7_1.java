import java.io.*;
public class EX7_1
{
 public static void main(String argv[])
 { 
 	String str=null;
  System.out.print("請您輸入一個字串 : ");
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  try
  {
   str=bin.readLine();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
  System.out.println();
  System.out.print("您輸入的字串是 : ");
  for(int i=str.length()-1;i>=0;i--)
  {
   System.out.print(str.charAt(i));
  }
 } 
}