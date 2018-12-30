import java.io.*;
public class OutputStreamWriterTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileOutputStream fos=new FileOutputStream("SampleFile1.txt");
   OutputStreamWriter os=new OutputStreamWriter(fos,"ISO2022CN");	
  // System.out.println("code:"+os.getEncoding());
   os.close();
   fos.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }		
  finally
  {
   System.out.println("謝謝使用本程式");	
  }	
 }
}