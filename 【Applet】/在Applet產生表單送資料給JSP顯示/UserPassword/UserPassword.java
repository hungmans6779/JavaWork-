import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class UserPassword extends Panel
{
 TextField tfUser;
 TextField tfPassword;	
 EventHandler eh;
 Label lUser;
 Label lPassword;
 boolean changeColor=true;
 public UserPassword()
 {
 	eh=new EventHandler();
 	tfUser=new TextField();
 	tfPassword=new TextField();
 	
 	tfUser.addTextListener(eh);
 	tfPassword.addTextListener(eh);
 	
 	tfUser.setColumns(10);
 	tfPassword=new TextField();
 	tfPassword.setEchoChar('*');
 	tfPassword.setColumns(10);
 	
 	Panel p1=new Panel(new FlowLayout());
 	p1.add(new Label("�b��"));
 
  lUser=new Label("testtesatatast");	
  
 	p1.add(tfUser);
 	p1.add(lUser);
 	
 	Panel p2=new Panel(new FlowLayout());
 	p2.add(new Label("�K�X"));
 	
 	lPassword=new Label();
 	p2.add(tfPassword);
 	p2.add(lPassword);

 	
 	setLayout(new GridLayout(2,1));
 	add(p1);
 	add(p2);
 }		
 
 
 //��ť��
 //----------------------------------------------------------------------
 class EventHandler implements TextListener
 {
  public void textValueChanged(TextEvent te)
  {
   if(changeColor)
   {	
    tfUser.setForeground(Color.BLACK);
    tfPassword.setForeground(Color.BLACK);	
   } 
   changeColor=true;
  }		
 }
 //----------------------------------------------------------------------
 	
 
 //�^�ǨϥΪ̿�JUser���m�W
 public String getUserName()
 {
 	return tfUser.getText();
 /*
 	String str="";
 	try
 	{
 	 str=URLEncoder.encode(tfUser.getText(),"US-ASCII");
 	}
 	catch(UnsupportedEncodingException us){} 
 	return str;
 	*/
 }		
 
 //�^�ǨϥΪ̿�JUser���K�X
 public String getPassword()
 {
  return  tfPassword.getText();
 }	
 
 public void setUseErrorMessage()
 {
 	lUser.setText("�z����J���");
 	changeColor=false;
 }	
 
 public void setPasswordErrorMessage()
 {
 	lPassword.setText("�z����J���");
 	changeColor=false;
 }	
 
 
 //���ե�
 //----------------------------------------------------------------------
 public static void main(String argv[])
 {
 	Frame frame=new Frame("�o�O�@�Ӵ��յ���");
 	frame.add(new UserPassword());
 	frame.setLocation(200,200);
 	frame.setSize(200,100);
 	frame.addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	 	System.exit(0);
 	 }		
 	});	
 	frame.setVisible(true);
 }	
 //----------------------------------------------------------------------
 
}	