public class MyObjectTest1
{
 static int count;
 MyObjectTest1()
 {
  ++count;
 }
 public static void main(String argv[])
 {
  MyObjectTest1 o1=new MyObjectTest1();
  MyObjectTest1 o2=new MyObjectTest1();
  MyObjectTest1 o3=new MyObjectTest1();
  System.out.println("�ثe�� "+count+" �Ӫ������");
  o2=null;
  System.out.println("��ĳ�Ұʸ귽�^������");
  System.gc();
  //Runtime.getRuntime().gc();
  System.out.println("�ثe�ѤU "+count+" �Ӫ������");
 }
 protected void finalize() throws Throwable
 {
  --count;
  System.out.println("�{�b����finalize()���O:"+Thread.currentThread().getName());
 }
}