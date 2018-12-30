public class EXAME83
{
 private Object o;
 private void doSomethingElse(Object obj)
 {
  o=obj;
 }
 public void doSomething()
 {
  Object o=new Object();
  doSomethingElse(o);
  o=new Object();
  doSomethingElse(o);
  o=null;
 }
 public static void main(String argv[])
 {
 	new EXAME83().doSomething();	
 }	
}