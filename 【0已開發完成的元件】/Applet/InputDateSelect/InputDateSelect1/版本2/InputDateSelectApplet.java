import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
public class InputDateSelectApplet extends Applet
{
 InputDateSelect ids1;	
 InputDateSelect ids2;
 Button sendButton;
 EventHandler eh;
 AppletContext ac;
 public void init()
 {
 	/*
 	 �غc�l===>InputDateSelect(String label,int style,int start_year,int end_year)
 	 style���]�w�覡
    1.��ܥX�~������~���U�Ԧ����	
    2.��ܥH��ƾ䬰�D���~���U�Ԧ����
    3.��ܥi�H���ϥΪ̪����]�w�_�l�~���M�פ�~�����~���U�Ԧ����
    4.��ܫe��U50�~���U�Ԧ����
  */  
  eh=new EventHandler();
 	ids1=new InputDateSelect("�а����",2,0,0);
 	ids2=new InputDateSelect("�������",2,0,0);
 	
 	setLayout(new GridLayout(2,1));
 	Panel p1=new Panel(new FlowLayout());
 	p1.add(ids1);
 	p1.add(ids2);
 	Panel p2=new Panel(new FlowLayout());
 	sendButton=new Button("�e�X���");
 	sendButton.addActionListener(eh);
 	p2.add(sendButton);
 	add(p1);
 	add(p2);
 	ac=getAppletContext();
 }	
 
 class EventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
  	String �а����=ids1.getValue();
  	String �������=ids2.getValue();
  	try
  	{
  	 ac.showDocument(new URL("http://localhost/jsp/InputDateSelectApplet.jsp?"+"�а����="+�а����+"&�������="+�������));
  	}
  	catch(MalformedURLException me){} 
  }		
 }	
}