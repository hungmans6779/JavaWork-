import java.io.*;
public class FileWriterTest1
{
 public static void main(String argv[])
 {
  String s="JAVA SCJP 1.5";
  System.out.println("將字串\" "+s+" \"寫入到檔案中");
  System.out.println("字串的長度為: "+s.length()+" Bytes.");
  try
  {
   FileWriter fo=new FileWriter("FileWrite.txt");
   fo.write(s);
   fo.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}