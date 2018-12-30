import java.io.*;
public class FileInputStreamTest5
{
 public static void main(String argv[])
 {
  try
  {
   byte buffer[]=new byte[6];	
   FileInputStream fin=new FileInputStream("FileInputStream.txt");
   int i=fin.read(buffer);
   while(i==6)
   {
    System.out.print(new String(buffer));
    i=fin.read(buffer);
   }
    System.out.print(new String(buffer,0,i));
   
   fin.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	 
  }	
  
 }
}