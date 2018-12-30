import java.util.Scanner;
public class ScannerTest2
{
 public static void main(String argv[])
 {
  Scanner sc=new Scanner("100 JAVA");
  System.out.println("請輸入數字:");
  int i=sc.nextInt();
  System.out.println("請輸入一個字串:");
  String str=sc.next();
  System.out.println("您輸入的數字是:"+i);
  System.out.println("您輸入的字串是:"+str);
  sc.close();
 }
}