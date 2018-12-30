public class OverloadWrapperTest1
{
 public static void main(String argv[])
 {
  byte b=3;
  short s=3;
  long l=5l;
  float f=3;
  go(b);
  go(s);
  go(l);
  go(f);
 }
 static void go(int a)
 { System.out.println("int"); }
 static void go(long l)
 { System.out.println("long");}
 static void go(double d)
 { System.out.println("double"); }
}