import java.io.*;
public class FileWriterTest1
{
 public static void main(String argv[])
 {
  String s="JAVA SCJP 1.5";
  System.out.println("�N�r��\" "+s+" \"�g�J���ɮפ�");
  System.out.println("�r�ꪺ���׬�: "+s.length()+" Bytes.");
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