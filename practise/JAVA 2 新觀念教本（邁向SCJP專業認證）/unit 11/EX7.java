import java.net.*;
public class EX7
{
 public static void main(String argv[])
  throws MalformedURLException
 {
  if(argv.length<1)
  {
   System.out.println("請加上一個URL參數");	
  }	 
  else
  {
   parseURL(argv[0]);	
  }	
 }
 static void parseURL(String str) throws MalformedURLException
 {
  URL url=new URL(str);
  System.out.println("使用協定 : "+url.getProtocol());
  System.out.println("主機名稱 : "+url.getHost());	
 }	
}