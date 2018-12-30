import java.io.*;
public class InputStreamReaderTest1
{
 public static void main(String argv[])
 {
  try
  {
   Socket so=new Socket("localhost",8080);
   InputStream is=so.getInputStream();
   InputStreamReader inReader=new InputStreamReader(is,"ISO8859_1");  
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}