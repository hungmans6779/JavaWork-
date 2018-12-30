import java.io.*;
public class FileInputStreamTest2
{
 public static void main(String argv[])
 {
  try
  {
   byte buffer[]=new byte[2];	
   FileInputStream fis=new FileInputStream("SampleFile.txt");
   System.out.println("顯示可讀取位元組總數: "+fis.available()+" bytes.");
   System.out.println("檔案內容:");
   System.out.println("----------------------");
   while(fis.read(buffer)==2)
   {
   	String data=new String(buffer);
   	System.out.print(data);
   }	
   if(fis.available()%2!=0)
   {
   	String data=new String(buffer,0,1);
   	System.out.print(data);
   }	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}