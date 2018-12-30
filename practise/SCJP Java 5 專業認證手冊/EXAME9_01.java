public class EXAME9_01 implements Runnable
{
 private String name;
 public EXAME9_01(String name)
 {
 	this.name=name;
 }		
 public static void main(String argv[])
 {
  EXAME9_01 r1=new EXAME9_01("Wallace");
  EXAME9_01 r2=new EXAME9_01("Gromit");
  new Thread(r1).start();;
  new Thread(r2).start();
  //new Thread(new EXAME9_01("Wallace")).start();
  //new Thread(new EXAME9_01("Gromit")).start();
 }
 
 public void run()
 {
  message(1);
  message(2);	
 }	
 
 private synchronized void message(int n)
 {
  System.out.print(name+"-"+n+" ");	
 }	
}