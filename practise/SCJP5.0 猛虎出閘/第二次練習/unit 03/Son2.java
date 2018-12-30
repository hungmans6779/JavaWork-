import java.io.*;
class Father2
{
 void aMethod() throws Exception
 {
  System.out.println("這是父類別的方法");
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
  System.out.println("這是子類別的方法");
 }
}