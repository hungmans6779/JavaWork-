import java.io.*;
public class FileReaderTest1
{
 public static void main(String argv[])
 {
  try
  {
   char c[]=new char[1];
   FileReader fr=new FileReader("SampleFile.txt");
   while(fr.read(c)!=-1)
   {
    //System.out.print(c);	
    System.out.print(new String(c));
   }		
   fr.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }		
 }
}