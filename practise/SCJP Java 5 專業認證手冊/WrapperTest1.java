public class WrapperTest1
{
 public static void main(String argv[])
 {
  int a1=1;
  long l1=2l;
  test(l1);
 }
 public static void test(int x) { System.out.println("int"); }	
 public static void test(long y){ System.out.println("long"); }
}