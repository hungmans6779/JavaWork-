import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
public class UserPasswordApplet extends Applet
{
 UserPassword up;	
 String fileJSP;
 String userName;
 String password;
 AppletContext ac;
 public void init()
 {
  up=new UserPassword();	
  fileJSP=getParameter("fileJSP");
  
  ac=getAppletContext();
  
  Button b=new Button("°e¥X¸ê®Æ");
  b.addActionListener(new EventHandler());
  setLayout(new GridLayout(2,1));
  Panel p1=new Panel(new FlowLayout());
  p1.add(up);
  Panel p2=new Panel(new FlowLayout());
  p2.add(b);
  add(p1);
  add(p2);
 }
 	
 class EventHandler implements ActionListener
 {
 	public void actionPerformed(ActionEvent ae)
 	{
 	 userName=up.getUserName();
   password=up.getPassword();	
   if(userName.equals("") || password.equals("") )
   {
    if(userName.equals(""))
   	 up.setUseErrorMessage();
    if( password.equals(""))
   	 up.setPasswordErrorMessage();
   } 
   else
   {	
 	  String str="http://localhost/jsp/"+fileJSP+"?User="+userName+"&Password="+password;
 	  try
 	  {
 	   ac.showDocument(new URL(str)); 	
 	  }
 	  catch(MalformedURLException me){} 
 	 } 
 	}	
 }	
 	
}