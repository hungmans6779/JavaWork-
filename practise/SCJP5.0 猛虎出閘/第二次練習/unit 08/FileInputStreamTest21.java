import java.io.*;
public class FileInputStreamTest21
{
 public static void main(String argv[])
 {
  try
  {
   FileInputStream fis=new FileInputStream("SampleFile.txt");
   int totalByte=fis.available();
   byte buffer[]=new byte[totalByte];	
   System.out.println("顯示可讀取位元組總數: "+totalByte+" bytes.");
   System.out.println("檔案內容:");
   System.out.println("----------------------");
   if(fis.read(buffer)==totalByte)
   {
   	//String data=new String(buffer);
   	String data=new String(buffer,0,totalByte);
   	System.out.print(data);
   	System.out.println("\n現在可讀取的位元組總數:"+fis.available());
   }	
   else
   {
    System.out.println("資料位元組有誤");	
   }
   fis.close();	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}