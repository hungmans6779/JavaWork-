import java.io.*;
public class FileInputStreamTest11
{
 public static void main(String argv[])
 {

  try
  {
   FileInputStream fis=new FileInputStream("SampleFile.txt");
   byte buffer[]=new byte[1];
   System.out.println("顯示可讀取位元組總數:"+fis.available());
   System.out.println("檔案內容:");
   System.out.println("------------------");
   while(fis.read(buffer)!=-1)
   {
   	System.out.print((char)buffer[0]);
   }		
  }	
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  } 		
 }	
}