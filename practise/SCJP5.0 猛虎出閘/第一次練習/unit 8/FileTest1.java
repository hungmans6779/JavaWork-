import java.io.*;
public class FileTest1
{
 public static void main(String argv[])
 {
  File f=new File("NewFile.txt");
  System.out.println("檔案是否存在: "+f.exists());
  if(!f.exists())
  {
   try
   {
   	f.createNewFile();
   }		
   catch(IOException ioe)
   {
   	ioe.printStackTrace();
   }
  }	
  System.out.println("檔案是否存在: "+f.exists());
  f.deleteOnExit();
 }
}