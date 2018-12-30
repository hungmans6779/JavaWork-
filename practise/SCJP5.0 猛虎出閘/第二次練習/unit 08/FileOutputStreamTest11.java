import java.io.*;
public class FileOutputStreamTest11
{
 public static void main(String argv[])
 {
 	String data="Java 輸入與輸出( java.io 函式庫 )";
 	System.out.println("資料長度為:"+data.length()+" Bytes.");
  try
  {
   FileOutputStream fos=new FileOutputStream("SampleFile.txt",true);
   OutputStreamWriter os=new OutputStreamWriter(fos);
   BufferedWriter bw=new BufferedWriter(os);	
   bw.newLine();
   bw.write(data);
   bw.close();
   os.close();
   fos.close();
   
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }		
 }
}