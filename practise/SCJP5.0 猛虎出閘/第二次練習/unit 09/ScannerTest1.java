import java.util.*;
public class ScannerTest1
{
 public static void main(String argv[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("請輸入數字:");
  int i=sc.nextInt();
  System.out.print("請輸入字串:");
  String str=sc.next();
  System.out.println("\n您輸入的數字是:"+i);
  System.out.println("您輸入的字串是:"+str);
 }
}