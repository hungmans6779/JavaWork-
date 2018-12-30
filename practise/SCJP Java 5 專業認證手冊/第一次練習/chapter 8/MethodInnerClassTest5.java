public class MethodInnerClassTest5
{
 private int x=10;
 private static int sx=10;
 public static void main(String argv[])
 {
  new MethodInnerClassTest5().method();
 }
 public static void method()
 {
 	final int xx=100;
  class InnerClass
  {
   int x=1000;
   //static int sx=1000;
   public void getX()
   {
   	int x=10000;
    //System.out.println("x="+x);
    System.out.println("x = "+x);
    System.out.println("this.x = "+this.x);
    System.out.println("xx = "+xx);
    //System.out.println("InnerClass.x = "+InnerClass.x);
    System.out.println("MethodInnerClassTest5.sx = "+MethodInnerClassTest5.sx);
   }
  }
  new InnerClass().getX();
 }
}