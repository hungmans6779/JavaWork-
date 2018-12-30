class A
{}
class B extends A
{}
class C extends B
{}

public class DownwardTest1
{
 public static void main(String argv[])
 {
  if(new C() instanceof A)
  {
   A a=(A)new C();
   System.out.println("轉換成功........");
  }
  else
  {
   System.out.println("不能轉換........");
  }
 }
}
