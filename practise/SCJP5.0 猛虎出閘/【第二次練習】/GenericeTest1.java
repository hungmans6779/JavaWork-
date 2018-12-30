public class GenericeTest1
{
 public static void main(String argv[])
 {
  int a=1;
  test(a);
 }
 public static void test(long... x)
 {
  System.out.println("int");
 }
 public static void test(int ... x)
 {
  System.out.println("varage...");	
 }
}