import java.net.*;
class MyException extends MalformedURLException
{
 private String protocol;
 MyException(String msg,String protocol)
 {
  super(msg);
  this.protocol=protocol;
 }
 String getProtocol()
 {
  return protocol;
 }
}

public class EX8
{
 public static void main(String argv[])
 {
 	if(argv.length<1)
 	{
 	 System.out.println("�п�JWWW �� URL	�Ѽ�");
 	}	
 	else
 	{
 	 try
 	 {
 	 	parseURL(argv[0]);
 	 }
 	 catch(MyException me)
 	 {
 	  me.printStackTrace();
 	  String s=me.getMessage()+me.getProtocol();	
 	  System.out.println(s);
 	 }			
 	 catch(MalformedURLException mue)
 	 {
 	  System.out.println(mue.getMessage());	
 	 }	
 	}	
 }
 public static  void parseURL(String str) throws MalformedURLException
 {
 	URL url=new URL(str);
 	
 	if(!url.getProtocol().equals("http"))
 	 throw new MyException("��w���~",url.getProtocol());
 	 
 	System.out.println("�D���W�� : "+url.getHost());
 }	
}

