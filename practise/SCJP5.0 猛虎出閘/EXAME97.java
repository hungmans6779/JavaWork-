public class EXAME97
{
 public static void main(String argv[])
 {
  short y=6;
  long z=7;
  go(y);
  go(z);
 }
 public static void go(Long n)  { System.out.println("Long "); }
  public static void go(Short n) { System.out.println("Short"); }
  public static void go(int n)   { System.out.println("int");   }
}