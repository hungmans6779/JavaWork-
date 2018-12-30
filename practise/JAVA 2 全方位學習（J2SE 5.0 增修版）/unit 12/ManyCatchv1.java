import java.io.*;
public class ManyCatchv1
{
 public static void main(String argv[])
 {
  try
  {
   int i=Integer.parseInt(argv[0]);
   int ans=10/i;
   System.out.println("\n10/"+i+" = "+ans);
  }
  catch(ArithmeticException ae)
  {
   System.out.println("ArithmeticException : "+ae);
  }
  catch(NumberFormatException ne)
  {
   System.out.println("NumberFormatException : "+ne);
  }
  catch(ArrayIndexOutOfBoundsException aie)
  {
   System.out.println("ArrayIndexOutOfBoundsException : "+aie);
  }
  catch(RuntimeException re)
  {
   System.out.println("RuntimeException : "+re);
  }
  catch(Exception e)
  {
   System.out.println("Exception : "+e);
  }
  finally
  {
   System.out.println("µ{¦¡µ²§ô......");
  }
 }
}