import java.util.Scanner;
public class SwitchTest1
{
 public static void main(String argv[])
 {
 	Scanner kegin=new Scanner(System.in);
  System.out.print("請輸入今年是===>");
  int year=kegin.nextInt();
  System.out.print("請輸入月份===>");
  int month=kegin.nextInt();
  System.out.println("============================");
  switch(month)
  {
   //先判斷31天的月份	
   case 1:
   case 3:
   case 5:
   case 7:
   case 8:
   case 10:
   case 12:
            System.out.println(year+"年"+month+"月是31天");
            break;
   //判斷30天的月份            
   case 4:
   case 6:
   case 9:
   case 11:
         	  System.out.println(year+"年"+month+"月是31天");
            break;
   case 2:
          if(year%4==0)
          {
           if(((year%4==0)||(year%400==0))&&(year%100!=0))	
           	System.out.println("今年是:"+year+"年"+month+"月是28天"); //該年是潤年
           else
           	System.out.println("今年是:"+year+"年"+month+"月是29天"); //該年不是潤年
          }
          else
           System.out.println("今年是:"+year+"年"+month+"月是29天");	//該年不是潤年
          break;
   default: 
          System.out.println("您輸入的值不再1-12月份範圍內... ");
          break;
  }	
 }
}