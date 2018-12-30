public class AutoBoxingTest5_2
{
 public static void main(String argv[])
 {
  short i=10;
  go(i,i);
 }
 static void go(Short ... var)
 {
 	System.out.println("Short");
 }	
 static void go(Integer ... var)
 {
 	System.out.println("Integer");
 }	
  static void go(Long ... var)
 {
 	System.out.println("Long");
 }	
}