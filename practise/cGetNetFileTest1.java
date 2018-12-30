import java.net.*;
import java.io.*;
import java.util.*;
public class cGetNetFileTest1
{
 public static void main(String argv[]) throws IOException
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("請輸入您的網址=====>");
  String urlAddress=scan.next();
  
  if(!urlAddress.startsWith("http://"))
   urlAddress="http://"+urlAddress;
  
  URL url=new URL(urlAddress);
  String path=url.getPath();
  int indexValue=path.lastIndexOf('/'); 
  String fileName=path.substring(indexValue+1);
  InputStream is=url.openStream(); 
  FileOutputStream fos=new FileOutputStream(fileName);
  int temp=0;
  while((temp=is.read())!=-1)
   fos.write(temp);	
  fos.close();
  is.close();
 }
}