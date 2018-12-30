interface Runnable 
{
 void run();
}

public class EXAME8_3
{
 public static void main(String argv[])
 {
  System.out.println(new Runnable(){public void run(){}});
 }
}