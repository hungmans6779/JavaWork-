public class MyOutTest2
{
 private int x=10;
 private static int y=30;
 private static int z=20;
 public static void main(String argv[])
 {
  StaticInnerClass.get();
 }
 static class StaticInnerClass
 {
  int x=100;
  static int z=200;
  public static void get()
  {
   int x=1000;
   int z=2000;
   
   //System.out.println("MyOutTest2.this.x = "+MyOutTest2.this.x);
   //System.out.println("this.x= "+this.x);
   //System.out.println("StaticInnerClass.x = "+StaticInnerClass.x);
   System.out.println("x = "+x);
   System.out.println("z = "+z);
   System.out.println("StaticInnerClass.z = "+StaticInnerClass.z);
   System.out.println("MyOutTest2.z = "+MyOutTest2.z);
  }
 }
}