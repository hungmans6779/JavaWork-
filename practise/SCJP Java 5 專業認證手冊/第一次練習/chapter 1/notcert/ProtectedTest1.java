import cert.Roo2;
public class ProtectedTest1
{
 public static void main(String argv[])
 {
  ChildRoo2 c2=new ChildRoo2();
  c2.test();
  System.out.println(c2.doRooThings());
  //c2.doRooThings();
 }
}