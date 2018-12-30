import java.io.*;
public class ExceptionTest5
{
 public static void main(String argv[])
 {
  try
  {
   FileInputStream fin=new FileInputStream("1.txt");
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	
  finally
  {
   System.out.println("我成功了.........");
  }
 }
}