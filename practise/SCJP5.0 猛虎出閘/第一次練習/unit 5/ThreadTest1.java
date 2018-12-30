public class ThreadTest1
{
 public static void main(String argv[])
 {
 	 System.out.println("Hello Word");
 	 String str=Thread.currentThread().getName();
 	 System.out.println("現在的執行緒名稱為: "+str);
 	 System.out.println("現在可使用的執行緒數量："+Thread.activeCount());
 }	
}	