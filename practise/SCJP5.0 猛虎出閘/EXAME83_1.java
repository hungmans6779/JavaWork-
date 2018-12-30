public class EXAME83_1
{
 private EXAME83_1 o;
 private void doSomethingElse(EXAME83_1 obj)
 {
  o=obj;
 }
 public void doSomething()
 {
  EXAME83_1 o=new EXAME83_1();
  doSomethingElse(o);
  o=new EXAME83_1();
  System.gc();
  Runtime.getRuntime().gc();
  doSomethingElse(o);
  o=null;
  //Runtime.getRuntime().gc();
 }
 public void finalize()
 {
  System.out.println(this+"±Ò°ÊGC¤F");	
 }	
 public static void main(String argv[])
 {
 	new EXAME83_1().doSomething();	
 }	
}