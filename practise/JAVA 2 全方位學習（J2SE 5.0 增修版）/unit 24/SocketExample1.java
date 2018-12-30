import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.applet.*;
import java.io.*;
public class SocketExample1 extends Applet
{
 private Socket sock;
 private DataInputStream dataIn;
 private DataOutputStream dataOut;
 String srvName="java.cs.ccu.edu.tw";
 int srvPort=7;	
 Label label1,label2;
 TextField tf_send,tf_receive;
 Button button_send;
 
 public void init()
 {
 	setLayout(new GridLayout(2,3));
 	label1=new Label("�п�J���ǰe���r�� : ");
 	label2=new Label("Server  �Ǧ^���r�� : ");
 	tf_send=new TextField();
 	tf_receive=new TextField();
 	tf_receive.setEnabled(false);
 	
 	makeConnection();
  
  button_send=new Button("�e�X");
  button_send.addActionListener(new ActionListener()
  {
  	public void actionPerformed(ActionEvent e)
  	{
  	 send_recive();		
  	}
  });	
  add(label1);
  add(tf_send);
  add(button_send);
  add(label2);
  add(tf_receive); 	
 }	
 public void stop()
 {
 	try
 	{
 	 dataOut.close();
 	 dataIn.close();
 	 sock.close();
 	}
 	catch(IOException ioe)
 	{
 	 ioe.printStackTrace();		 
 	}
 }	
 
 public void makeConnection()
 {
 	try
 	{
  	InetAddress srvAddr=InetAddress.getByName(srvName);
  	sock=new Socket(srvAddr,srvPort);
  	dataIn=new DataInputStream(new BufferedInputStream(sock.getInputStream()));
  	dataOut=new DataOutputStream(new BufferedOutputStream(sock.getOutputStream()));
  	System.out.println("Connection to server ok");
  }	
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	
 }	
 
 private void send_recive()
 {
 	 try
  	 {
  	 	dataOut.writeUTF(tf_send.getText());
  	 	dataOut.flush();
  	 	System.out.println(tf_send.getText());
  	 	tf_receive.setText(dataIn.readUTF());
  	 }		
  	 catch(IOException ioe)
  	 {
  	 	ioe.printStackTrace();
  	 }   
 }	
}	