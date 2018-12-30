public class EnumT2
{
 private static enum Week
 {
  Sunday,
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday
  {
   public String toString()
   {
   	return "猴子搞同性戀";	
   }	
  }
  ,
  Saturday
 }
 public static void main(String argv[])
 {
 	for(Week w:Week.values())
 	{
 		
 	 System.out.print(w+" : "); 	
 	 switch(w)
 	 {
 	  case Sunday:
 	   System.out.println("星期一猴子穿新衣");
 	   break;
    case Monday:
  	 System.out.println("星期二猴子肚子餓");
  	  break;
  	case Friday:
  	 System.out.println();
  	 System.out.println("==========================");
  	 System.out.print(Week.Friday);
  	 System.out.println("是真的嗎...............");
  	 System.out.println("==========================");
  	 break;  
 	  default:
 	   System.out.println("懶得再寫了呀.......哈");
 	   break; 	
 	 }	
 	}
 }
} 