import java.io.*;
public class MyType2
{
 public static void main(String argv[])
 {
  try
  {
   FileInputStream fIn=new FileInputStream("test.txt");
   while(fIn.available()>0)
   {
    System.out.print((char)fIn.read());
   }  
   fIn.close();
  }
  catch(IOException e)
  {
   System.out.println(e);
  }
 }
}