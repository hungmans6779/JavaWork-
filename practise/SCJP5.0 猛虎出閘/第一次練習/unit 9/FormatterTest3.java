import java.util.*;
import java.io.*;
public class FormatterTest3
{
 public static void main(String argv[])
 {
 	try
 	{
   Formatter f=new Formatter(new File("Format.txt"));
   f.format("¶ê¶g²v: %f",Math.PI);
   f.close();
  }
  catch(IOException ioe)
  {
   System.out.println(ioe.getMessage());	
   System.out.println(ioe.getLocalizedMessage());	
   ioe.printStackTrace();	
  }	 
 
 }
}