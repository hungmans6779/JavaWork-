import java.io.*;
public class FileTest1_1
{
 public static void main(String argv[])
 {
 	try
 	{
 	 File file=new File("File1.txt");
 	 System.out.println("File1.txt �ɮ׬O�_�s�b : "+file.exists());
   System.out.println("�ɮ׬O�_�����إ� : "+file.createNewFile());
   System.out.println("File1.txt �ɮ׬O�_�s�b : "+file.exists());
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getMessage());
   System.out.println(ioe.getLocalizedMessage());	
  }	 
 }		
}	