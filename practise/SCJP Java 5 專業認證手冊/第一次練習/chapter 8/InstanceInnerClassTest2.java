public class InstanceInnerClassTest2
{
 public static void main(String argv[])
 {
  new InstanceInnerClassTest2().new InnerClass().getX();
 }
 class InnerClass
 {
  public void getX()
  {
   int x=10;
   System.out.println("x = "+x);
   System.out.println("this = "+this);
   System.out.println("InstanceInnerClassTest2.this = "+InstanceInnerClassTest2.this);
  }
 }
}