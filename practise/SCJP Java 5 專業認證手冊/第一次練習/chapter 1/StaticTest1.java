public class StaticTest1
{
 class InnerClass
 {
  //static int i=10;
  final int v=10;
  final int i=30;
 }
 static class InnerClass1
 {
 	static int k=20;
 }	
 StaticTest1()
 {
 	System.out.println(new InnerClass().i);
 	System.out.println(InnerClass1.k);
 }	
 public static void main(String argv[])
 {
  //static int i=10;
  final int k=10;
  System.out.println(new StaticTest1().new InnerClass().v);
 }
}