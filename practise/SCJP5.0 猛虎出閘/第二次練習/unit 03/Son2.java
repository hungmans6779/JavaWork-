import java.io.*;
class Father2
{
 void aMethod() throws Exception
 {
  System.out.println("�o�O�����O����k");
 }
}

public class Son2 extends Father2
{
 public static void main(String argv[])
 {
  Son2 son=new Son2();
  try
  {
   son.aMethod();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());
  }
 }
 void aMethod() throws IOException
 {
  System.out.println("�o�O�l���O����k");
 }
}