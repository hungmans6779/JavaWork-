import java.io.*;
public class FileTest1
{
 public static void main(String argv[])
 {
 	try
 	{
 	 boolean newFile=false;
 	 File file=new File("File1.txt");
 	 System.out.println("File1.txt 檔案是否存在 : "+file.exists());
   newFile=file.createNewFile();
   System.out.println("檔案是否完成建立 : "+newFile);
   System.out.println("File1.txt 檔案是否存在 : "+file.exists());
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }	 
 }		
}	