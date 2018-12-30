import java.io.*;
public class ExceptionTest1
{
 public static void main(String argv[])
 {
 	try
 	{
 	 FileInputStream fis=new FileInputStream("ok.txt");
 	}
 	catch(FileNotFoundException e)
 	{
 	 System.out.print("printStackTrace===");
 	 e.printStackTrace();
 	 System.out.println();
 	 System.out.println("getLocalizedMessage()===>"+e.getLocalizedMessage());
 	 System.out.println("getMessage()===>"+e.getMessage());	
 	}		
 }	
}