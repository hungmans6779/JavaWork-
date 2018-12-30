public class GenericsTest1_2
{
 public static void main(String argv[])
 {
  Long a1=1l;
  test(a1);
  Integer a2=2; //±N¾É­P½sÄ¶¿ù»~
  test(a2);
 }
 public static void test(Long... x)
 {
  System.out.println("int");
 }
 public static void test(Integer... x)
 {
  System.out.println("varage...");	
 }
}