import java.io.*;
public class EX2_1
{
 public static void main(String argv[])
 {
  try
  {
   byte buffer[]=new byte[1024];
   System.out.print("�п�J�@�Ӧr�� : ");
   int size=System.in.read(buffer);
   System.out.println("�z��J���r��O"+new String(buffer,0,size));
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  } 
 }
}