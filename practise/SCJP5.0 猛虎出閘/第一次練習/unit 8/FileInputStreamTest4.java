import java.io.*;
public class FileInputStreamTest4
{
 public static void main(String argv[])
 {
  FileInputStream fin;
  try
  {
   fin=new FileInputStream("FileInputStream.txt");
   int i=fin.read();
   while(i!=-1)
   {
    System.out.print((char)i);
    i=fin.read();
   }
   fin.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}