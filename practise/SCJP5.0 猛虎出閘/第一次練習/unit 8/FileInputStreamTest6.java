import java.io.*;
public class FileInputStreamTest6
{
 public static void main(String argv[])
 {
 	try
 	{
 	 FileInputStream fin=new FileInputStream("FileInputStream.txt");	
 	 byte buffer[]=new byte[fin.available()];	
 	 fin.read(buffer);
 	 System.out.print(new String(buffer));
 	 fin.close();
 	}	
 	catch(IOException ioe)
 	{
 	 ioe.printStackTrace();	
 	}	
 }		
}	