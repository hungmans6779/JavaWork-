import java.util.Scanner;
public class Test006
{
 public static void main(String argv[])
 {
  Scanner keyin=new Scanner(System.in);
  System.out.print("請輸入第一個數字：");
  int a1=keyin.nextInt();
  System.out.print("請輸入第二個數字：");
  int a2=keyin.nextInt();
  System.out.println();
  System.out.println("第一個數字a1是："+a1+",第二個數字a2是："+a2);
  System.out.println("=========================");
  System.out.println("(a1+a2)="+(a1+a2));
  System.out.println("(a1-a2)="+(a1-a2));
  System.out.println("(a1*a2)="+(a1*a2));
  System.out.println("(a1/a2)="+(a1/a2));
 }
}