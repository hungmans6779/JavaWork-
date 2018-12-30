import java.io.*;
public class FileInputStreamTest21
{
 public static void main(String argv[])
 {
  try
  {
   FileInputStream fis=new FileInputStream("SampleFile.txt");
   int totalByte=fis.available();
   byte buffer[]=new byte[totalByte];	
   System.out.println("��ܥiŪ���줸���`��: "+totalByte+" bytes.");
   System.out.println("�ɮפ��e:");
   System.out.println("----------------------");
   if(fis.read(buffer)==totalByte)
   {
   	//String data=new String(buffer);
   	String data=new String(buffer,0,totalByte);
   	System.out.print(data);
   	System.out.println("\n�{�b�iŪ�����줸���`��:"+fis.available());
   }	
   else
   {
    System.out.println("��Ʀ줸�զ��~");	
   }
   fis.close();	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}