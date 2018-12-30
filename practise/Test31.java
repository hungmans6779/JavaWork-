import java.util.*;
public class Test31
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("請輸入第一個a值:");
  int a=scan.nextInt();
  System.out.print("請輸入第二個b值：");
  int b=scan.nextInt();
  int sa=a;
  int sb=b;
  int temp;
  while(b!=0)
  {
   temp=a%b;
   a=b;
   b=temp;
  }
  System.out.println(sa+","+sb+"的最小公倍數:"+a);
 }
}