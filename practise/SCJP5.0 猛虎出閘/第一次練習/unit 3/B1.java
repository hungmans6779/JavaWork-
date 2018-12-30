class A
{
 private static int count=0;
 public static int getInstanceCount()
 {
  return count;
 }
 public A()
 {
  count++;
 }
}
public class B1
{
 public static void main(String argv[])
 {
   A a1=new A();
   A a2=new A();
   A a3=new A();
   System.out.println(A.getInstanceCount());
 }
}