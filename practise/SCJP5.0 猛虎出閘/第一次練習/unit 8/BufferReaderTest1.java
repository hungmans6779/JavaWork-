import java.io.*;
public class BufferedReaderTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileReader fin=new FileReader("FileWriter.txt");
   BufferedReader bfin=new BufferedReader(fin); 
   String data=null;
   data=bfin.readLine();
   while(data!=null)
   {
    System.out.println(data);
    data=bfin.readLine();
   }
   bfin.close();
   fin.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}