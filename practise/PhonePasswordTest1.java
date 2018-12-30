import java.util.*;
public class PhonePasswordTest1
{
 public static void main(String argv[])
 {
 	Scanner s=new Scanner(System.in);
  System.out.print("請輸入手機的密碼===>");
  int phonePassword=s.nextInt();
  System.out.print("請輸入手機的SIM卡密碼===>");
  int simPassword=s.nextInt();
  if(phonePassword==123) //如果手機密碼正確
  {
   if(simPassword==456) //如果SIM卡密碼正確
   {
   	System.out.println("手機密碼及SIM卡密碼正確！！！");
   	System.out.println("歡迎您使用本手機....");
   }
   else
   {
   	System.out.println("SIM卡密碼錯誤！！！");
   }			
  }
  else //手機密碼錯誤，再判斷SIM卡是否錯誤
  {
   if((simPassword==456) && (phonePassword==123))
   {
   	System.out.println("手機密碼及SIM卡密碼正確！！！");
   	System.out.println("歡迎您使用本手機....");
   }
   else if(simPassword==456)
   {
   	System.out.println("手機密碼錯誤！！！");
   }	
   else //SIM卡密碼錯誤
   {
   	System.out.println("手機密碼錯誤！！！");
    System.out.println("SIM卡密碼錯誤！！！");
   }		
  }		
 }
}