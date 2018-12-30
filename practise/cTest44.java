import java.io.*;
public class cTest44
{
 public static void main(String argv[])
 {
  try
  {
   FileReader fr=new FileReader(new File("java.txt"));
   int temp=0;
   while((temp=fr.read())!=-1)
   {
   	System.out.print((char)temp);
   }	
  }
  catch(IOException e)
  {
  	Exception ee=new Exception(e);
  	System.out.println(ee);
  	ee.printStackTrace();
  	System.out.println(ee.getMessage());
  	System.out.println(ee.getLocalizedMessage());
  }		
 }
}