public class EXAME087_1
{
 public static void test() throws Error
 {
  if(true) throw new AssertionError();
  System.out.println("test");
 }
 public static void main(String argv[])
 {
  test();
  System.out.println("end");
 }
}