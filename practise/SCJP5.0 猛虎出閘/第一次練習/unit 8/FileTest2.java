import java.io.*;
public class FileTest2
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
  System.out.println("檔案的絕對路徑為: "+f.getAbsolutePath());
  System.out.println("檔案的絕對路徑為: "+f.getAbsoluteFile());
  System.out.println("檔案的路徑為: "+f.getPath());
  System.out.println("檔案的上一層路徑為: "+f.getParent());
  System.out.println("檔案名稱為: "+f.getName());
  System.out.println("檔案最後修改時間為: "+f.lastModified());
  System.out.println("檔案是否可以寫入: "+f.canRead());
  System.out.println("檔案是否可以讀取: "+f.canWrite());
  System.out.println("檔案的長度為: "+f.length());
  System.out.println("檔案是否為隱藏的形式: "+f.isHidden());
  System.out.println("檔案的格式是否為檔案格式存在: "+f.isFile());
  System.out.println("檔案的格式是否為目錄的格式存在: "+f.isDirectory());
  
 }
}