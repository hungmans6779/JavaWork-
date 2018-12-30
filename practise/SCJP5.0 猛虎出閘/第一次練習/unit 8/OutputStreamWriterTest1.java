import java.io.*;
public class OutputStreamWriterTest1
{
 public static void main(String argv[])
 {
  try
  {
   FileOutputStream fout=new FileOutputStream("A.txt");
   OutputStreamWriter outWrite=new OutputStreamWriter(fout,"ISO2022CN");
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}