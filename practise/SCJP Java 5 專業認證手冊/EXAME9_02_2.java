public class EXAME9_02_2 extends Thread
{
 private String name;
 public EXAME9_02_2(String name)
 {
 	this.name=name;
 }	
 public void write()
 {
  System.out.print(name);
  System.out.print(name);	
 }	
 public void run()
 {
  synchronized(this)
  {
   write();	
  }		
 }
 public static void main(String argv[])
 {
 	new EXAME9_02_2("X").start();
 	new EXAME9_02_2("Y").start();
 }		
}