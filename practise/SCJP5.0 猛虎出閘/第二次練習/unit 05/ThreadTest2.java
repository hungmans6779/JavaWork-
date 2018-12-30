public class ThreadTest2
{
 public static void main(String argv[])
 {
  System.out.println("Hello World");
  Thread.currentThread().setName("Hello");
  String name=Thread.currentThread().getName();
  System.out.println("執行緒名稱:"+name);
  System.out.println("現在有多少條執行緒可用:"+Thread.activeCount());
 }
}