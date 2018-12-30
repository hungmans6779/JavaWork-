import java.io.*;
public class FileInputStreamTest1
{
 public static void main(String argv[])
 {
  byte buffer[]=new byte[1];
  try
  {
   FileInputStream fis=new FileInputStream("SampleFile.txt");
   System.out.println("顯示可讀取資料位元組總數:"+fis.available()+" bytes.");
   System.out.println("檔案內容:");
   System.out.println("-------------------------");
   while(fis.read(buffer)!=-1)
   {
    System.out.print((char)buffer[0]);	
   }
   fis.close();	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	 
 }
}