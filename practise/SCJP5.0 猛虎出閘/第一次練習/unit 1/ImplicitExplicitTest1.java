class ImplicitExplicitTest1
{
 static int i;
 static double d;
 static float f;
 public static void main(String argv[])
 {
  i=(int)d;
  d=i;
  System.out.println(i);
  System.out.println(d);
  f=(float)2.5;
  float f1=2.5f;
  System.out.println(f);
  System.out.println(f1);
 }
}