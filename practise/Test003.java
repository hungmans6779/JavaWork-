import java.util.Scanner;
public class Test003
{
 public static void main(String argv[])
 {
  Scanner keyin=new Scanner(System.in);
  
   System.out.print("請輸入姓名===>");
   String name=keyin.next();
   System.out.print("請輸入年齡===>");
   int age=keyin.nextInt();
   System.out.println("\n"+name+" 今年是"+age);
 }
}