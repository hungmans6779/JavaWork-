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
   System.out.println("����ҥ~ : "+ex.getMessage());
  }
 }
 static void m()
 {
  throw new RuntimeException("�ҥ~�@");
 }
 static void n()
 {
  throw new Exception("�ҥ~�G");
 }
}