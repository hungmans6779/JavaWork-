import java.util.Scanner;
public class YearTest1
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  while(true)
  {
   System.out.println("================================");
   System.out.print("請輸入您目前的年份===>");
   int year=kegin.nextInt();
   if(year%4==0)
   {
    if(((year%400==0)||(year%4==0))&&(year%100!=0)) //判斷4及400的倍數，但不是100的倍數
      System.out.println("您輸入的年份是"+year+"年，該年是潤年...");
    else 
     System.out.println("您輸入的年份是"+year+"年，該年不是潤年...");
   }
   else //直接判斷出不是潤年了...
    System.out.println("您輸入的年份是"+year+"年，該年不是潤年...");
  } 		
 }
}