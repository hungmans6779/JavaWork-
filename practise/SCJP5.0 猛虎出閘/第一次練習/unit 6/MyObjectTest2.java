public class MyObjectTest2

{
 static int count;
 MyObjectTest2()
 {
  count++;
 }
 public static void main(String argv[])
 {
  MyObjectTest2 obj1=new MyObjectTest2();
  MyObjectTest2 obj2=new MyObjectTest2();
  MyObjectTest2 obj3=new MyObjectTest2();
  System.out.println("�ثe�� "+count+" �Ӫ������");
  System.out.println("��ĳ�Ұʸ귽�^������");
  obj2=null;
  
  System.gc();
  //Runtime.getRuntime().gc();
  
  System.runFinalization();
  System.out.println("�ثe�Ѿl "+count+" �Ӫ������");
 }
 protected void finalize() throws Throwable
 {
  count--;
  System.out.println("����finalize()���O : "+Thread.currentThread().getName());
 }
}