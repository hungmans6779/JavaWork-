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
  System.out.println("目前有 "+count+" 個物件實體");
  System.out.println("建議啟動資源回收機制");
  obj2=null;
  
  System.gc();
  //Runtime.getRuntime().gc();
  
  System.runFinalization();
  System.out.println("目前剩餘 "+count+" 個物件實體");
 }
 protected void finalize() throws Throwable
 {
  count--;
  System.out.println("執行finalize()的是 : "+Thread.currentThread().getName());
 }
}