import java.io.*;
public class FileTest1
{
 public static void main(String argv[])
 {
  File f=new File("NewFile.txt");
  System.out.println("檔案是否存在?"+f.exists());
  if(!f.exists())
  {
   try
   {
   	 System.out.println("利用createNewFile()建立新檔案,是否建立成功?"+f.createNewFile());
   }
   catch(IOException ioe)
   {
    System.out.println(ioe.getMessage());	
   }			
  }
  System.out.println("檢查新檔案是否存在?"+f.exists());	
 }
}