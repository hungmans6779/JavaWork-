import java.awt.*;
import java.applet.*;
import java.net.*;
public class InetAddressExample1 extends Applet
{
 TextArea ta;
 public void init()
 {
 	ta=new TextArea(5,25);
 	add(ta);
 	try
 	{
 	 InetAddress inetadd=InetAddress.getLocalHost();
 	 ta.append("Host I  P : "+inetadd.getHostAddress()+"\n");
 	 ta.append("Host Name :	"+inetadd.getHostName()+"\n");
 	 ta.append("Host      : "+inetadd.toString()+"\n");
 	}	
 	catch(Exception ioe)
 	{
 	 ioe.printStackTrace();	
 	}	
 }	
}