import java.io.*;
public class dataInputExample
{
 public static void main(String argv[])
 {
 	try
 	{
 	 FileInputStream fIn=new FileInputStream("random.txt");
 	 DataInputStream dis=new DataInputStream(fIn);
 	 while(fIn.available()>0)
 	 {
 	 	System.out.println(dis.readDouble());
 	 }		
 	 fIn.close();
 	 dis.close();
 	}
 	catch(IOException e)
 	{
 		e.printStackTrace();
 	}		
 }		
}	