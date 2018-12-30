import java.util.*;
public class InputNumberHandler1
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  System.out.print("請輸入一個數值===>");
  int input=kegin.nextInt();
  if(input>=0)
  {
   if(input>0)
    System.out.println("您輸入的是正數");
   else
    System.out.println("您輸入的是0");
  }
  else
  {
   System.out.println("您輸入的是負數");
  }
 }
}