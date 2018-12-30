import java.util.*;
public class BlankTest2
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("=========================");
  System.out.println("        功能選單         ");
  System.out.println("=========================");
  System.out.println("1.提款");
  System.out.println("2.轉帳");
  System.out.println("3.餘額查詢");
  System.out.println("4.離開本系統");
  System.out.print("請輸入您要的功能:");
  int select=scan.nextInt();
  System.out.println("\n******************");
  switch(select)
  {
   case 1: System.out.println("您的選擇是提款");
           System.out.println("謝謝使用本系統");
           break;
   case 2: System.out.println("您的選擇是轉帳");
           System.out.println("謝謝使用本統統");         	
           break;
   case 3: System.out.println("您的選擇是餘額查詢");
           System.out.println("謝謝使用本統統");
           break;
   case 4: System.out.println("謝謝使用本統統");
           break;
   default: System.out.println("您的選項不再此功能表內");
            System.out.println("謝謝使用本統統");
            break;
  }	
 }
}