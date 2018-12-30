public class AutoBoxingTest5_5
{
 public static void main(String argv[])
 {
  Integer i=10;
  Long l=10l;
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