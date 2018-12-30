import java.io.*;
public class FoundFileTest1
{
 public static void main(String argv[])
 {
 	String filename="";
  do
  {
   try
   {
   	InputStreamReader isr=new InputStreamReader(System.in);
   	BufferedReader br=new BufferedReader(isr);
   	System.out.print("�п�J�z�n�䪺�ɮ�===>");
   	filename=br.readLine();
   }
   catch(IOException ioe)
   {
    System.out.println(ioe);
   }			
  }while(!openFile(filename));
  System.out.println("�w�g���:�i"+filename+"�j�ɮפF...");
 }
 public static boolean openFile(String filename)
 {
 	try
 	{
 	 FileInputStream fis=new FileInputStream(filename);
 	 return true;	
 	}	
 	catch(IOException ioe)
 	{
 	  System.out.println(ioe.getLocalizedMessage());
 	 return false;	
 	}	
 }	
}