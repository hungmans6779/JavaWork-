import java.io.*;
public class EX2_1
{
 public static void main(String argv[])
 {
  try
  {
   byte buffer[]=new byte[1024];
   System.out.print("請輸入一個字串 : ");
   int size=System.in.read(buffer);
   System.out.println("您輸入的字串是"+new String(buffer,0,size));
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  } 
 }
}