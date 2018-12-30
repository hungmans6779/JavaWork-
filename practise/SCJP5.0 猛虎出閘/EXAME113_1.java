import java.io.*;
public class EXAME113_1 implements Runnable
{
 public void run() throws InterruptedException
 {
  System.out.println("run . ");
  throw new InterruptedException();
 }
 public static void main(String argv[]) 
 {
 	Thread t=new Thread(new EXAME113_1());
 	t.start();
 	System.out.println("End of method.");
 }	
}