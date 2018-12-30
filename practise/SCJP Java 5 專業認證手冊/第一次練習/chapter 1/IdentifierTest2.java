public class IdentifierTest2
{
 static int _a;
 int $b;
 public IdentifierTest2()
 {
 	System.out.println("$b = "+$b);
 }	
 public static void main(String argv[])
 {
 	new IdentifierTest2();
  System.out.println(_a);
 }
}
