import java.io.*;
public class Test026
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
    System.out.print("請輸入您要找的檔案名稱===>");
    filename=br.readLine();
    }
    catch(IOException ioe)
    {
     System.out.println(ioe);
    }	 
   }while(!openfile(filename));
  System.out.println("已經找到"+filename);   
 }
 public static  boolean openfile(String filename)
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