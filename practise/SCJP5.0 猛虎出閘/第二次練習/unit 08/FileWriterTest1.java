import java.io.*;
public class FileWriterTest1
{
 public static void main(String argv[])
 {
  try
  {
   String s="Java 輸入與輸出( java.io 函式庫 )";
   System.out.println("將字串\""+s+"\"寫到檔案");
   System.out.println("資料長度為:"+s.length()+" Bytes.");
   FileWriter fw=new FileWriter("SampleFile.txt",true);	
   fw.write(s);
   fw.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }		
 }
}