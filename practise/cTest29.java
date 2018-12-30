import java.util.*;
public class cTest29
{
 enum week {星期一,星期二,星期三};
 public static void main(String argv[])
 {
  switch(week.valueOf("星期一"))
  {
  	case 星期一:
  	 System.out.println("猴子穿新衣");
  	 break;
  	case 星期二:
  	 System.out.println("猴子穿新衣");
  	 break;
  }
  for(week w:week.values())
  {
   System.out.println(w);	
  }	
 } 	
}