import java.io.*;
public class FileInputStreamTest3
{
 public static void main(String argv[])
 {
 	FileInputStream fin;
 	byte buffer[]=new byte[2];
 	int totalsize=0;
 	try
 	{
 	 fin=new FileInputStream("FileInputStream.txt");
 	 totalsize=fin.available();
 	 System.out.println("���ɮת����׬�: "+totalsize);
 	 System.out.println("============================");
 	 System.out.println("���ɮת����e�p�U");
 	 while(fin.read(buffer)==2)
 	 {
 	 	System.out.print(new String(buffer));
 	 }	
 	 if(totalsize%2!=0)
 	 {
 	 	System.out.print(new String(buffer,0,1));
 	 }	
 	 fin.close();
 	} 
 	catch(IOException ioe)
 	{
 	 ioe.printStackTrace();	
 	}	
 	
 }		
}	