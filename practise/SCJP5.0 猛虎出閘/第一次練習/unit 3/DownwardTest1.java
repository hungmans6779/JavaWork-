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
   System.out.println("�ഫ���\........");
  }
  else
  {
   System.out.println("�����ഫ........");
  }
 }
}
