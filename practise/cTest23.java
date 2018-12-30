import java.util.*;
public class cTest23
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
  System.out.print("請輸入一個數值");
  String data=scan.next();
  if(!data.matches("[A-Z][1-9]{9}"))
  {
   System.out.println("輸入格式錯誤");	
  }	
  else
  {
   System.out.println("正確");	
  }	
  
 }
}