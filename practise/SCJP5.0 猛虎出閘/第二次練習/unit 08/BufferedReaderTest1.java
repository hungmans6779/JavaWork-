import java.io.*;
public class BufferedReaderTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileReader fr=new FileReader("SampleFile.txt");
   BufferedReader br=new BufferedReader(fr);
   String data;
   while((data=br.readLine())!=null)
   {
    System.out.println(data);	
   }		
   br.close();
   fr.close();
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