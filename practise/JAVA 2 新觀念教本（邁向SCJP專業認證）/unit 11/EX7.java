import java.net.*;
public class EX7
{
 public static void main(String argv[])
  throws MalformedURLException
 {
  if(argv.length<1)
  {
   System.out.println("�Х[�W�@��URL�Ѽ�");	
  }	 
  else
  {
   parseURL(argv[0]);	
  }	
 }
 static void parseURL(String str) throws MalformedURLException
 {
  URL url=new URL(str);
  System.out.println("�ϥΨ�w : "+url.getProtocol());
  System.out.println("�D���W�� : "+url.getHost());	
 }	
}