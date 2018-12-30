import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class DateSelectApplet extends Applet
{
 DateSelect ds;


 Button sendButton;
 EventHandler eh;
 AppletContext ac;


 public void init()
 {
  ds=new DateSelect();
  add(ds);
  ac=getAppletContext();

  sendButton=new Button("°e¥X¸ê®Æ");
  eh=new EventHandler();
  sendButton.addActionListener(eh);
  add(sendButton);
  
 }
 class EventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent e) 
  {
   String str="http://localhost/jsp/DateSelectApplet.jsp?Date=";
   String data=ds.getDateFormat();
   str=str+data;
   try
   {
    ac.showDocument(new URL(str)); 
   }
   catch(MalformedURLException me){}
   
  }
 }

}