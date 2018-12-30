import java.util.*;
import java.io.*;
public class FormatterTest31
{
 public static void main(String argv[])
 {
  try
  {
   Formatter f=new Formatter(new File("foo1.txt"));
   f.format("¶ê©P²v=%f",Math.PI);
   f.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  }
 }
}