import java.io.*;
public class ExceptionTest10
{
 public static void main(String argv[])
 {
  try
  {
   showException();
  }
  catch(Exception e)
  {
   System.out.println("�d�I���\�F...");	
   System.out.println("���~�T���O : "+e.getMessage());
  }
 }
 static void showException() throws FileNotFoundException,EOFException,Exception
 {
 	 FileInputStream fin=new FileInputStream("1.txt");
 	// throw new FileNotFoundException("��");
  
 }	
}