import cert.Roo2;
public class ChildRoo2 extends Roo2
{
 void test()
 {
  System.out.println(doRooThings());
 }
 public static void main(String argv[])
 {
 	new ChildRoo2().test();
 	//new Roo2().doRooThings();
 	new ChildRoo2().doRooThings();
 }	
}