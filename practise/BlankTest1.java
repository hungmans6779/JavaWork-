import java.util.*;
public class BlankTest1
{
 public static void main(String argv[])
 {
  int errorCount=0; //errorCount是用來判斷錯誤的次數...
  Scanner kegin=new Scanner(System.in);
  System.out.print("請輸入您的密碼(8位數)===>");
  int password=kegin.nextInt();
  //密碼內定為12345678
  if(password==12345678)
  {
   System.out.println();
   System.out.println("*************************************");
   System.out.println("歡迎您進入本系統，請選擇您要的功能...");	
   System.out.println("1.提款");
   System.out.println("2.餘額查詢");
   System.out.println("3.轉帳");
   System.out.println("4.其它功能");
   System.out.println("5.離開...");
  }	
  else //第一次失敗
  {
   System.out.println("您的密碼輸入第1次錯誤！！！");
   System.out.println("您還可以再輸入二次...");
   System.out.println("====================================");
   System.out.print("請再輸入一次密碼==>");
   password=kegin.nextInt();
   if(password==12345678)
   {
    System.out.println();
    System.out.println("*************************************");
    System.out.println("歡迎您進入本系統，請選擇您要的功能...");	
    System.out.println("1.提款");
    System.out.println("2.餘額查詢");
    System.out.println("3.轉帳");
    System.out.println("4.其它功能");
    System.out.println("5.離開...");
   }
   else //第二次失敗
   {
   	System.out.println("您的密碼輸入第2次錯誤！！！");
    System.out.println("您還可以再輸入一次...");
    System.out.println("====================================");
    System.out.print("請再輸入一次密碼==>");
    password=kegin.nextInt();
    if(password==12345678)
    {
     System.out.println();
     System.out.println("*************************************");
     System.out.println("歡迎您進入本系統，請選擇您要的功能...");	
     System.out.println("1.提款");
     System.out.println("2.餘額查詢");
     System.out.println("3.轉帳");
     System.out.println("4.其它功能");
     System.out.println("5.離開...");
    }
    else //第三次失敗...
    {
    	System.out.println("這位顧客，抱歉您連續輸入了3次密碼都是錯誤的...");
    	System.out.println("卡片失效了...");
    	System.out.println("您的卡片要被回收了...");
    }	 
   }	 
  }	
 }
}