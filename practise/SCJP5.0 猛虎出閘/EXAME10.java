public class EXAME10
{
 public static void main(String argv[])
 {
  short y=6;
  int z=7;
  go(y);
  //go(z); //½sÄ¶¿ù»~
 }
 public static void go(short n) { System.out.println("short");  }
 public static void go(Short n) { System.out.println("Short"); }
 public static void go(Long n) {System.out.println("Long"); }
}