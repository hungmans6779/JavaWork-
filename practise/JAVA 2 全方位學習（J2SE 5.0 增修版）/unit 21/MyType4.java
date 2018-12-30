import java.io.*;
public class MyType4
{
 public static void main(String argv[])
 {
  try
  {
   //File f=new File("test.txt");	
   File f=new File("joke.txt");	
   FileReader fin=new FileReader(f);
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