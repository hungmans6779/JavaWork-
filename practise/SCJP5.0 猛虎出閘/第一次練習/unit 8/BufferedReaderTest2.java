import java.io.*;
public class BufferedReaderTest2
{
 public static void main(String argv[])
 {
  try
  {
   FileReader fin=new FileReader("FileWriter.txt");
   BufferedReader bfin=new BufferedReader(fin); 
   String data=null;
   while((data=bfin.readLine())!=null)
   {
    System.out.println(data);
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