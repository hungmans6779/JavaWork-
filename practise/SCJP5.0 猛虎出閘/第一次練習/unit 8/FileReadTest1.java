import java.io.*;
public class FileReadTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileReader fr=new FileReader("FileInputStream.txt");
   char buffer[]=new char[1];
   while(fr.read(buffer)!=-1)
   {
    //System.out.print(buffer);
    System.out.print(new String(buffer));
   }
   fr.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}