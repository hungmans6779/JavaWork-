import java.net.*;
import java.io.*;

public class UDPEchoServer
{
	public static void main(String args[])
	{
		int port = Integer.parseInt(args[0]);

		try
		{
			DatagramSocket srv = new DatagramSocket(port);
			System.err.println("Echo server start at port: "+port);
			
			while (true)
			{
				byte[] buffer = new byte[256];
				DatagramPacket packet = new DatagramPacket(buffer,256);
				srv.receive(packet);
				
				InetAddress clnt = packet.getAddress();
				int clnt_port =packet.getPort();
				System.out.println("Client connect from: "+clnt+" #"+clnt_port);
				String str = new String(packet.getData());
				System.out.println("Message from client : "+str);
				
				String send = str.toUpperCase();
				buffer = send.getBytes();
				
				packet = null;
				packet = new DatagramPacket(buffer, buffer.length, clnt, clnt_port);
				srv.send(packet);
			}
		}
		catch(SocketException se)
		{
			System.err.println(se);
		}			
		catch(IOException ioe)
		{
			System.err.println(ioe);
		}
	}
}