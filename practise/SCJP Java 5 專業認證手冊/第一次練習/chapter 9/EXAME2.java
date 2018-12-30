public class EXAME2 extends Thread
{
 private String name;
 public EXAME2(String name)
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
 	//synchronized(this)
 	//synchronized(EXAME2.class)
 	synchronized(System.out)
 	{
 	 write();
 	} 
 }	
 public static void main(String argv[])
 {
  EXAME2 e=new EXAME2("X");
  e.start();
  //e.start();
  
  new EXAME2("Y").start();
 }
}