import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
public class InputDateSelectApplet extends Applet
{
 InputDateSelect ids1;	
 Button sendButton;
 AppletContext ac;
 public void init()
 {
 	ac=getAppletContext();
 	String label=getParameter("label");
 	int style=Integer.parseInt(getParameter("style"));
 	int start_year=Integer.parseInt(getParameter("start_year"));
 	int end_year=Integer.parseInt(getParameter("end_year"));
 	ids1=new InputDateSelect();
 	Panel p1=new Panel(new FlowLayout());
 	p1.add(ids1);
 	Panel p2=new Panel(new FlowLayout());
 	Button b=new Button("送出資料");
 	b.addActionListener(new EventHandler());
 	p2.add(b);
 	setLayout(new GridLayout(2,1));
 	add(p1);
 	add(p2);
 }	
 class EventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
   if(!ids1.getValue().equals(""))
   {
    String str="http://localhost/jsp/InputDateSelectApplet.jsp?日期="+ids1.getValue();	
    try
    {
     ac.showDocument(new URL(str));		
    }
    catch(MalformedURLException me){} 
   } 
  	
  }		
 }	
}