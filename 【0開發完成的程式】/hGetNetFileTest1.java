import java.net.*;
import java.io.*;
import java.util.*;
public class hGetNetFileTest1
{
 public static void main(String argv[]) throws Exception
 {
  Scanner  scan=new Scanner(System.in);
  System.out.print("請輸入網址===>");
  String urlAddress=scan.next();
  if(!urlAddress.startsWith("http://"))
   urlAddress="http://"+urlAddress;
  String fileName=urlAddress.substring(urlAddress.lastIndexOf("/")+1);
  System.out.println("正在下載的檔案是:"+fileName);
  URL url=new URL(urlAddress);  
 
  
  
  InputStream is=url.openStream();
  FileOutputStream fos=new FileOutputStream(fileName);
  int temp=0;
  while((temp=is.read())!=-1)
  {
   fos.write(temp);
  }	
  fos.close();
  is.close();
  
 }
}