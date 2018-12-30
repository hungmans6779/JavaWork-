import java.awt.*;
import java.applet.*;
import java.net.*;
public class ShowDoc extends Applet
{
 AppletContext ac;	
 public void init()
 {
 	ac=getAppletContext();
 }
 
 public void start()
 {
 	try
 	{
 	 ac.showDocument(new URL("http://www.slime.com.tw"));
 	}
 	catch(MalformedURLException me)
 	{
 	 System.out.println(me.toString());	
 	}	 
 }			
}	