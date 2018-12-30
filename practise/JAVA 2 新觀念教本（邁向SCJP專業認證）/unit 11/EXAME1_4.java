import java.io.*;
public class EXAME1_4
{
 public static void main(String argv[])
 {
  try
  {
   m();
   n();
  }
  catch(Exception ex)
  {
   System.out.println("捉到例外 : "+ex.getMessage());
  }
 }
 static void m()
 {
  throw new RuntimeException("例外一");
 }
 static void n()
 {
  throw new Exception("例外二");
 }
}