import java.io.*;
import java.net.*;
public class InputStreamReaderTest1
{
 public static void main(String argv[])
 {
  try
  {
   Socket so=new Socket("localhost",8080);
   InputStream is=so.getInputStream();
   InputStreamReader isr=new InputStreamReader(is,"ISO8859_1");
   System.out.println("code:"+isr.getEncoding());
   isr.close();
   is.close();
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