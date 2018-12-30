public class EXAME9
{
 public static void main(String argv[])
 {
  System.out.print("1 ");
  synchronized(argv)
  {
   System.out.print("2 ");
   try
   {
    argv.wait();
   }
   catch(InterruptedException ie)
   { }
  }
  System.out.print("3 ");
  
 }
}