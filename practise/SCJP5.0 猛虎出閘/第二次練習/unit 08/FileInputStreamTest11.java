import java.io.*;
public class FileInputStreamTest11
{
 public static void main(String argv[])
 {

  try
  {
   FileInputStream fis=new FileInputStream("SampleFile.txt");
   byte buffer[]=new byte[1];
   System.out.println("��ܥiŪ���줸���`��:"+fis.available());
   System.out.println("�ɮפ��e:");
   System.out.println("------------------");
   while(fis.read(buffer)!=-1)
   {
   	System.out.print((char)buffer[0]);
   }		
  }	
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  } 		
 }	
}