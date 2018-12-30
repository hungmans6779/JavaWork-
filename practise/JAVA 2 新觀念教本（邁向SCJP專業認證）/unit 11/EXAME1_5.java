import java.io.*;
public class EXAME1_5
{
 public static void main(String argv[])
 {
  try
  {
   m();
  }
  catch(Exception e)
  {
  
  }
 }
 static void m() throws Exception 
 {
  throw new EOFException();
 }
}