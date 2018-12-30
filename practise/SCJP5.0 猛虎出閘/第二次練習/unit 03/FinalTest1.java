public class FinalTest1
{
 final int PI=3;
 //final int PI;
 FinalTest1()
 {
 	final int TI;
 	TI=2;
 	System.out.println("PI="+PI);
 	System.out.println("TI="+TI);
 }	
 public static void main(String argv[])
 {
  new FinalTest1().fooA();	
 }	
 public void fooA()
 {
  final int MI;
  MI=10;	
  //MI++;
  System.out.println("MI="+MI);
 }	
}