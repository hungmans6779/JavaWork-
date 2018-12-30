public class AutoBoxingTest3_1
{
 public static void main(String argv[])
 {
  short s=10;
  int i=10;
  float f=10f;
  go(f);
 }
  static void go(int i)
 {
 	System.out.println("int");
 }	
 static void go(double d)
 {
 	System.out.println("double");
 }	 
 static void go(Integer i)
 {
  System.out.println("Integer");
 }
 static void go(Double d)
 {
  System.out.println("Double");
 }
}