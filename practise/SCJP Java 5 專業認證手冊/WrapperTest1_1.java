public class WrapperTest1_1
{
 public static void main(String argv[])
 {
  Integer a1=1;
  Long l1=2l;
  test(a1);
 }
 public static void test(int x) { System.out.println("int"); }	
 public static void test(long y){ System.out.println("long"); }
}