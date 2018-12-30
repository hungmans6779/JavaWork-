import java.io.*;
public class MyType1
{
 public static void main(String argv[])
 {
  try
  {
   File f=new File("test.txt");	
   FileInputStream fin=new FileInputStream(f);
   int i=fin.read();
   while(i!=-1)
   {
    System.out.print((char)i);
    i=fin.read();	
   }	
   fin.close();
  }
  catch(IOException e)
  {
  	System.out.println(e);
  }
 } 			
}	