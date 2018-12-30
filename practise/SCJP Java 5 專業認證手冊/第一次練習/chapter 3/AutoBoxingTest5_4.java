public class AutoBoxingTest5_4
{
 public static void main(String argv[])
 {
  int i=10;
  long l=10l;
  go(i);
  go(l);
 }
 static void go(Integer... i)
 {
  System.out.println("Integer");
 }
 static void go(Long... l)
 {
  System.out.println("Long");
 }
 
}