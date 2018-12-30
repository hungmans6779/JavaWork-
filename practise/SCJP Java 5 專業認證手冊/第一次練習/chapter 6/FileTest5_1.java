import java.io.*;
public class FileTest5_1
{
 public static void main(String argv[])
 {
  File file[]=new File[100];
  File f=new File("FileDir");
  file=f.listFiles();
  for(int i=0;i<file.length;i++)
  {
   if(file[i].isDirectory())
   {
    System.out.println(file[i]+" 是一個目錄");
   }
   else
   {
    System.out.println(file[i]+" 是一個檔案");
   }
  }
 }
}