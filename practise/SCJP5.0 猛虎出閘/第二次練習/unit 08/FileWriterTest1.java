import java.io.*;
public class FileWriterTest1
{
 public static void main(String argv[])
 {
  try
  {
   String s="Java ��J�P��X( java.io �禡�w )";
   System.out.println("�N�r��\""+s+"\"�g���ɮ�");
   System.out.println("��ƪ��׬�:"+s.length()+" Bytes.");
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