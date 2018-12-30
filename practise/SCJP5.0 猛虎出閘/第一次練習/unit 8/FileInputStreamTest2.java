import java.io.*;
public class FileInputStreamTest2
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
 	 System.out.println("此檔案的長度為: "+totalsize);
 	 System.out.println("============================");
 	 System.out.println("此檔案的內容如下");
 	 while(fin.read(buffer)==2)
 	 {
 	 	String data=new String(buffer);
 	 	System.out.print(data);
 	 }	
 	 if(totalsize%2!=0)
 	 {
 	 	String data=new String(buffer,0,1);
 	 	System.out.print(data);
 	 }	
 	 fin.close();
 	} 
 	catch(IOException ioe)
 	{
 	 ioe.printStackTrace();	
 	}	
 	
 }		
}	