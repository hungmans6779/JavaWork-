enum Week
{
 Sunday
 {
 	public String toString()
 	{
 	 return "小飛仔";
 	}	
 }	
 ,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
public class EnumTest8
{
 public static void main(String argv[])
 {
 	Week ww[]=Week.values();
 	for(Week w:ww)
 	{
   switch(w)
   {
    case Sunday:
     System.out.println(Week.Sunday);
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
}