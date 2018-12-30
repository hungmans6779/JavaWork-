public class Test3
{
 
 public static void main(String argv[])
 {
  Test3 t3=new Test3();
  t3.A();
 }
  public void A()
 {
  MyObject obj1=new MyObject(10);
  System.out.println("原先的MyObject obj1.data = "+obj1.data); 
  B(obj1);
  System.out.println("傳入後MyObject obj1.data = "+obj1.data); 
  System.gc();
 }
  public void B(MyObject obj2)
 {
  obj2.data=20;
  obj2=null;
 }
}