import java.io.*;
public class FileOutputStreamTest1
{
 public static void main(String argv[])
 {
  String s="Java 輸入與輸出( java.io 函式庫 )";
  byte data[]=s.getBytes();
  System.out.println("將字串\""+s+"\"寫到檔案");
  System.out.println("資料的長度:"+data.length+" Bytes.");
  try
  {
   FileOutputStream fos=new FileOutputStream("SampleFile.txt",true);	
   fos.write(data);	
   fos.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());	
   System.out.println(ioe.getLocalizedMessage());
  }		
  //System.out.println(new String(data));
 }
}