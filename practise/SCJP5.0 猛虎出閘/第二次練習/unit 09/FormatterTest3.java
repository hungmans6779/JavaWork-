import java.util.*;
import java.io.*;
public class FormatterTest3
{
 public static void main(String argv[])
 {
 	try
 	{
   File file=new File("foo.txt");
   Formatter f=new Formatter(file);
   f.format("¶ê©P²v=%f",Math.PI);
   f.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }	 
 }
}