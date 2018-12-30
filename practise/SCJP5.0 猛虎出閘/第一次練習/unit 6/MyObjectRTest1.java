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
  System.out.println("目前有 "+count+" 個物件實體");
  System.out.println("建議啟動資源回收機制");
  System.gc();
  Runtime.getRuntime().gc();
  System.out.println("目前剩餘 "+count+" 個物件實體");
 }
 public void finalize() 
 {
  count--;
  System.out.println("執行finalize()的是 : "+Thread.currentThread().getName());
 }
}