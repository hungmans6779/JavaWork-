public class GenericsTest1_1
{
 public static void main(String argv[])
 {
  Long a=1l;
  //Integer a=2; //±N¾É­P½sÄ¶¿ù»~
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