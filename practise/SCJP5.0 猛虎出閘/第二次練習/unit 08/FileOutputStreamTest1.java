import java.io.*;
public class FileOutputStreamTest1
{
 public static void main(String argv[])
 {
  String s="Java ��J�P��X( java.io �禡�w )";
  byte data[]=s.getBytes();
  System.out.println("�N�r��\""+s+"\"�g���ɮ�");
  System.out.println("��ƪ�����:"+data.length+" Bytes.");
  try
  {
   FileOutputStream fos=new FileOutputStream("SampleFile.txt",true);	
   fos.write(data);	
   fos.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());	
   System.out.println(ioe.getLocalizedMessage());
  }		
  //System.out.println(new String(data));
 }
}