public class Ex10
{
 public static void go(short n)
 {
  System.out.println("short");
 }
 public static void go(Short n)
 {
  System.out.println("Short");
 }
 public static void go(Long n)
 {
  System.out.println("Long");
 }
 public static void main(String argv[])
 {
  Short y=6;
  Long z=7L;
  go(y);
  go(z);
 }
}