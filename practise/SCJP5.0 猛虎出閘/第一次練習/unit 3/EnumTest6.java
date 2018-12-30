enum Week
{
 Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
public class EnumTest6
{
 public static void main(String argv[])
 {
  switch(Week.Sunday)
  {
   case Sunday:
    System.out.println("星期一");
    break;
   case Monday:
    System.out.println("星期二");
    break;
   case Tuesday:
    System.out.println("星期三");
    break;
   default:
    System.out.println("您輸入的資料錯誤..........");
    break; 	
  	
  }	
 }
}