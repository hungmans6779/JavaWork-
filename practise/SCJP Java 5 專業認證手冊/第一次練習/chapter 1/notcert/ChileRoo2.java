import cert.Roo2;
public class ChildRoo2 extends Roo2
{
 void test()
 {
  System.out.println(doRooThings());
 }
 public void main(String argv[])
 {
 	new ChildRoo2().test();
 }	
}