public class InnerEnumTest2
{
 public enum Week
 {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
 public static void main(String argv[])
 {
  switch(Week.Monday)
  {
   case Monday:
    System.out.println("星期一 猴子穿新衣");
    break;
    
   case Tuesday:
    System.out.println("星期二 猴子去烤肉");
    break;
   
   case Wednesday:
    System.out.println("星期三 猴子去爬山");
    break;
   
   default:
    System.out.println("不知怎麼了....");
    break;
  
  }
 }

}