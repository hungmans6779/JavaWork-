import java.io.*;
public class MyType3
{
 public static void main(String argv[])
 {
 	byte bytes[]=new byte[32];
  try
  {
   FileInputStream fIn=new FileInputStream("test1.txt");
   //FileInputStream fIn=new FileInputStream("joke.txt");
   int i=fIn.read(bytes);
   while(i==32)
   {
    System.out.print(new String(bytes));
    i=fIn.read(bytes);
   }
   System.out.print(new String(bytes,0,i));
   fIn.close();
  }
  catch(IOException e)
  {
   System.out.println(e);
  }
 }
}