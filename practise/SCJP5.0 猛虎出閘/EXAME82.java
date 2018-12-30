public class EXAME82
{
 public static void main(String argv[])
 {
  int x=5;
  EXAME82 exame82=new EXAME82();
  exame82.doStuff(x);
  System.out.print("main x = "+x);
 }
 public void doStuff(int x)
 {
 	System.out.print("doStuff x = "+x++);
 }	
}