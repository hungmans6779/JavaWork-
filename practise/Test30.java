import java.util.Scanner;
public class Test30
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("請輸入一個數值===>");
  int value=scan.nextInt();
  System.out.println("如果大於10，則印出大於10，否則印出小於10...");
  String str=(value>9)?"其值大於10":"其值小於10";
  System.out.println("結果是:"+str);
 }
}