public class EXAME9_02_1 extends Thread
{
 private String name;
 public EXAME9_02_1(String name)
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
  synchronized(EXAME9_02_1.class)
  {
   write();	
  }		
 }
 public static void main(String argv[])
 {
 	new EXAME9_02_1("X").start();
 	new EXAME9_02_1("Y").start();
 }		
}