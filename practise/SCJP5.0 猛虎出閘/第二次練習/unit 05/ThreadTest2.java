public class ThreadTest2
{
 public static void main(String argv[])
 {
  System.out.println("Hello World");
  Thread.currentThread().setName("Hello");
  String name=Thread.currentThread().getName();
  System.out.println("������W��:"+name);
  System.out.println("�{�b���h�ֱ�������i��:"+Thread.activeCount());
 }
}