import java.io.*;
public class FileTest1
{
 public static void main(String argv[])
 {
  File f=new File("NewFile.txt");
  System.out.println("�ɮ׬O�_�s�b?"+f.exists());
  if(!f.exists())
  {
   try
   {
   	 System.out.println("�Q��createNewFile()�إ߷s�ɮ�,�O�_�إߦ��\?"+f.createNewFile());
   }
   catch(IOException ioe)
   {
    System.out.println(ioe.getMessage());	
   }			
  }
  System.out.println("�ˬd�s�ɮ׬O�_�s�b?"+f.exists());	
 }
}