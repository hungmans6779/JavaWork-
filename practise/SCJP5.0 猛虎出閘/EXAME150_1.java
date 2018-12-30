public class EXAME150_1
{
 public static void logIt(String ... msgs)
 {
  for(String str:msgs)
  {
   System.out.print(str+"\t");	
  }	
  System.out.println();
 }
 /* 將導致編譯失敗，因為引數的型態重覆了 
 public static vod logIt(String [] ss)
 {
 	System.out.println("我被運算到了");
 }	
 */
 public static void main(String argv[])
 {
  logIt("log message1");
  logIt("log message1","log message2");
  logIt("log message1","log message2","log message3");
  String [] s=new String[]{"RED","GREEN","BLUE","YELLOW"};
  logIt(s);
 }
}