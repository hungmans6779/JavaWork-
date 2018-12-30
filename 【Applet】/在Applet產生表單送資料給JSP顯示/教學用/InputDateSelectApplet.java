import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class InputDateSelectApplet extends Applet
{
 InputDateSelect ids;
 Button bSend;
 AppletContext ac;
 EventHandler eh;
 public void init()
 {
  ids=new InputDateSelect();

  bSend=new Button("送出資料");
  eh=new EventHandler();
  bSend.addActionListener(eh);
  setLayout(new GridLayout(2,1));
  add(ids);
  Panel p1=new Panel(new FlowLayout());
  p1.add(bSend);
  add(p1);
  ac=getAppletContext();
 }
 class EventHandler implements ActionListener
 {
 	public void actionPerformed(ActionEvent ae)
 	{
 	 String str=ids.getValue();	
 	 String data="http://www.yahoo.com.tw?日期="+str;
 	 try
 	 {
 	  ac.showDocument(new URL(data));	
 	 }
 	 catch(MalformedURLException me){} 
 	}	
 }	

}