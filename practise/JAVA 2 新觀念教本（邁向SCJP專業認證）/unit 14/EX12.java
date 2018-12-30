import java.io.*;
public class EX12
{
 public static void main(String argv[]) throws IOException
 {
  String path;
  if(argv.length<1)
   path=".";
  else
   path=argv[0];
   
  File f=new File(path);
  System.out.println("絕對路徑:"+f.getAbsolutePath());
  System.out.println("標準路徑:"+f.getCanonicalPath());
  System.out.println("為目錄:"+f.isDirectory());
  System.out.println("為檔案:"+f.isFile());
 }
}