public class Test9
{
 private static enum Week
 {
  Sunday,
  Monday,
  Tuesday
  {
   public String toString()
   {
   	return "哈哈我是被覆寫的";
   }	
  },
  Wednesday,
  Thursday
  {
   public String toString()
   {
   	return "真糟糕我也是被覆寫了.....";
   }	
  },
  Friday,
  Saturday
 }
 public static void main(String argv[])
 {
 	// 第一種取Enum列舉型態值的方法
 	System.out.print(Week.Sunday);
 
 	
 	// 第二種取Enum列舉型態值的方法

 	System.out.println("\n====================");
 	Week week=Week.Sunday;
 	System.out.print(week.Sunday);
 	
 	
 	// 第三種取Enum列舉型態值的方法
 	System.out.println("\n====================");
 	Week [] week2=Week.values();
 	for(int i=0;i<week2.length;i++)
 	{
 	 System.out.print(week2[i]+",");	
 	}	
 	
 	// 第四種取Enum列舉型態值的方法
 	System.out.println("\n====================");
 	for(Week week3:Week.values())
 	{
 	 System.out.print(week3+",");	
 	}	
 	
 	// 第五種取Enum列舉型態值的方法
 	System.out.println("\n====================");
 	System.out.print(Week.valueOf("Sunday"));
 }	
} 