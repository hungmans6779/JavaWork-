import java.util.*;
public class YearTest2
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("請輸入年份==>");
  int year=scan.nextInt();
  if(year%4==0)
  {
   if(year%100!=0)
   {
   	System.out.println("是潤年");
   }		
   else
   {
   	if((year%400==0)&&(year%100!=0))
   	{
   	 System.out.println("是潤年");	
   	}	
   	else
   	{
   	 System.out.println("不是潤年");	
   	}	
   }	
  }
  else
  {
   System.out.println("不是潤年");	
  }		
 }
}