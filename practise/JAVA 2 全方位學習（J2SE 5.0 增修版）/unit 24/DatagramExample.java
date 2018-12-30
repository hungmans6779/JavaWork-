import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import java.io.*;

public class DatagramExample extends Applet
{
  InetAddress srv;
  DatagramSocket clnt;
  DatagramPacket packet;
  byte[] buffer = new byte[256];

  String srvName;
  int srvPort;
  Label label1,label2;
  TextField textfield_send,textfield_receive;
  Button button_send;
  
  public void init()
  {
  	setLayout(new GridLayout(2,3));
  	
	label1 = new Label("請輸入欲傳送字串：");
	label2 = new Label("Server 傳回的字串：");
	textfield_send = new TextField();
	textfield_receive = new TextField();
	textfield_receive.setEditable(false);
	srvName = "140.123.101.247";
	srvPort = 7;
	makeConnection();

	button_send = new Button("送出");
	button_send.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			send_receive();
		}
	}
	);
	add(label1);
	add(textfield_send);
	add(button_send);
	add(label2);
	add(textfield_receive);
  }
  
  private void send_receive()
  {
	try
	{
		buffer = textfield_send.getText().getBytes();
		packet = new DatagramPacket(buffer,buffer.length,srv,srvPort);
		clnt.send(packet);
		
		clnt.receive(packet);
		
		String receive = new String(packet.getData());
		textfield_receive.setText(receive);
	}
	catch (IOException IOE)
	{
		System.err.println(IOE);
	}
  }
  private void makeConnection()
  {
    try
    {
	  clnt = new DatagramSocket();
	  srv = InetAddress.getByName(srvName);
	  
      System.err.println("Connection to server ok\n");
    }
    catch (IOException io)
    {
      System.err.println("Error:"+io);
    }
  }
  public void stop()
  {
    try
    {
    	packet = null;
    	clnt.close();
    	srv = null;
    }
    catch (Exception io) {};
  }
}