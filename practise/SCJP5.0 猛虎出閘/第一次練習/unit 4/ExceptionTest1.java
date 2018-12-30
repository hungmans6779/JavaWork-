import java.io.*;

class ExceptionTest1
{
 public static void main(String argv[])
 {	
  try
  {
   FileInputStream fin=new FileInputStream("1.txt");
  }
  catch(FileNotFoundException fnfe)
  {
   System.out.println(2);
  }
  catch(IOException ioe)
  {
   System.out.println(3);	
  }	
  catch(Exception e)
  {
   System.out.println(4);
  }
 } 

}