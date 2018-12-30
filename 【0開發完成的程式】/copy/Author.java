import java.util.*;
public class Author 
{
 public static void showAuthor()
 {
  long l=System.currentTimeMillis();
  Date presentTime=new Date(l); 
  
 
  System.out.println("\n=======================================================================");
  System.out.println("程式設計者：洪 嘉 宏");
  System.out.println("撰寫日期  ：95 年 06 月 23 日");
  System.out.println("程式說明  ：模擬 Window命令列模式下的 Copy 指令及（Unix系列中的 cp 指令）");
  System.out.println("撰寫心得  ：完全模擬出 copy 的指令，達到百分之百的地步，嘔心瀝血版.......");
  System.out.println("=========================================================================");
  System.out.println("目前程式執行的時間是 ： "+presentTime);
 }
}