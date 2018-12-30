public class ThreadTest1
{
 public static void main(String argv[])
 {
  System.out.println("Hello World");
  String name=Thread.currentThread().getName();
  System.out.println("Thread name:"+name);
 }
}