import java.util.*;
public class Author
{
 public static void showAuthor()
 {
  long l=System.currentTimeMillis();
  Date presentTime=new Date(l); 
  
 
  System.out.println("\n==========================================================");
  System.out.println("程式設計者：洪 嘉 宏");
  System.out.println("撰寫日期  ：95 年 06 月 01 日");
  System.out.println("程式說明  ：為了瞭解Interface及其Extends的應用方式");
  System.out.println("==========================================================");
  System.out.println("目前程式執行的時間是 ： "+presentTime);
  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
 }
}