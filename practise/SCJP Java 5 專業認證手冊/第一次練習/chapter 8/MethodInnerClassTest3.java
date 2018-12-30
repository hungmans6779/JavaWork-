public class MethodInnerClassTest3
{
 private int x=10;
 private int sx=20;
 public static void main(String argv[])
 {
  new MethodInnerClassTest3().method();
 }
 public void method()
 {
 	final int x=100;
 	final int xx=1000;
  class MethodInnerClass
  {
   int x=1000;		
   public void getX()
   {
   	int x=10000;
    System.out.println("x = "+x);
    System.out.println("this.x = "+this.x);
    System.out.println("xx = "+xx);
    System.out.println("MethodInnerClassTest3.this.x = "+MethodInnerClassTest3.this.x);
    //System.out.println("MethodInnerClassTest3.sx = "+MethodInnerClassTest3.sx);
    System.out.println("MethodInnerClassTest3.this.sx = "+MethodInnerClassTest3.this.sx);
   }
  }
  new MethodInnerClass().getX();
 }
}