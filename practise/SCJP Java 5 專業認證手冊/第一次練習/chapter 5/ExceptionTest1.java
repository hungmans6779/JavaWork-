import java.io.*;
public class ExceptionTest1
{
 public static void main(String argv[])
 {
 	try
 	{
   amethod();
  }
  catch(IOException ioe)
  {
    System.out.println("§Ú®·®»¨ì¨Ò¥~");
  }	 
 }
 static void amethod() throws IOException
 {
  bmethod();
 }
 static void bmethod() throws IOException
 {
  cmethod();
 }
 static void cmethod() throws IOException
 {
  //FileInputStream fin=new FileInputStream("1.txt");
  throw new IOException();
 }
}