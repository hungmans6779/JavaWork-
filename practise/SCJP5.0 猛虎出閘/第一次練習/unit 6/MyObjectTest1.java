public class MyObjectTest1

{
 static int count;
 MyObjectTest1()
 {
  count++;
 }
 public static void main(String argv[])
 {
  MyObjectTest1 obj1=new MyObjectTest1();
  MyObjectTest1 obj2=new MyObjectTest1();
  MyObjectTest1 obj3=new MyObjectTest1();
  System.out.println("�ثe�� "+count+" �Ӫ������");
  System.out.println("��ĳ�Ұʸ귽�^������");
  obj2=null;
  
  System.gc();
  //Runtime.getRuntime().gc();
  System.out.println("�ثe�Ѿl "+count+" �Ӫ������");
 }
 protected void finalize() throws Throwable
 {
  count--;
  System.out.println("����finalize()���O : "+Thread.currentThread().getName());
 }
}