import java.io.*;
public class FileTest2
{
 public static void main(String argv[])
 {
  //String path="C:\\Program Files\\Java\\jdk1.6.0\\";
  String path="C:/Program Files/Java/jdk1.6.0/";
  File f1=new File(path);
  String filelist[]=f1.list();
  for(int i=0;i<filelist.length;i++)
  {
   File f2=new File(path+filelist[i]);
   if(f2.isDirectory())
   	System.out.println(filelist[i]+" 是目錄.");
   else
    System.out.println(filelist[i]+" 是檔案.");
  }	
 }
}