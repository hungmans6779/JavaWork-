import java.io.*;
public class FileTest2
{
 public static void main(String argv[])
 {
  File f=new File("NewFile.txt");
  System.out.println("�ɮ׬O�_�s�b: "+f.exists());
  if(!f.exists())
  {
   try
   {
   	f.createNewFile();
   }		
   catch(IOException ioe)
   {
   	ioe.printStackTrace();
   }
  }	
  System.out.println("�ɮ׬O�_�s�b: "+f.exists());
  System.out.println("�ɮת�������|��: "+f.getAbsolutePath());
  System.out.println("�ɮת�������|��: "+f.getAbsoluteFile());
  System.out.println("�ɮת����|��: "+f.getPath());
  System.out.println("�ɮת��W�@�h���|��: "+f.getParent());
  System.out.println("�ɮצW�٬�: "+f.getName());
  System.out.println("�ɮ׳̫�ק�ɶ���: "+f.lastModified());
  System.out.println("�ɮ׬O�_�i�H�g�J: "+f.canRead());
  System.out.println("�ɮ׬O�_�i�HŪ��: "+f.canWrite());
  System.out.println("�ɮת����׬�: "+f.length());
  System.out.println("�ɮ׬O�_�����ê��Φ�: "+f.isHidden());
  System.out.println("�ɮת��榡�O�_���ɮ׮榡�s�b: "+f.isFile());
  System.out.println("�ɮת��榡�O�_���ؿ����榡�s�b: "+f.isDirectory());
  
 }
}