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
   System.out.println("攔截成功了...");	
   System.out.println("錯誤訊息是 : "+e.getMessage());
  }
 }
 static void showException() throws FileNotFoundException,EOFException,Exception
 {
 	 FileInputStream fin=new FileInputStream("1.txt");
 	// throw new FileNotFoundException("我");
  
 }	
}