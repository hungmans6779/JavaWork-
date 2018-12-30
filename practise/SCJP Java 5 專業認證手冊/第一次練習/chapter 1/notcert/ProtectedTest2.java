import cert.Roo2;
public class ProtectedTest2 extends ChildRoo2
{
 public void test1()
 {
 	System.out.println(doRooThings());
 }		
 public static void main(String argv[])
 {
  ChildRoo2 c2=new ChildRoo2();
  c2.test();
  new ProtectedTest2().test1();
  System.out.println(new ProtectedTest2().doRooThings());
 }
}