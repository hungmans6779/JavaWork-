import java.util.*;
public class Litter
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	System.out.print("叫块材计:");
 	int a=scan.nextInt();
 	int a1=a;
 	System.out.print("叫块材计:");
 	int b=scan.nextInt();
 	int b1=b;
 	//―程そ计
  while(b!=0)
  {
   int temp=a%b;
   a=b;
   b=temp;
  }	
  int litter=a*(a1/a)*(b1/a);
  System.out.println(a1+","+b1+"程そ计:"+litter);
 }
}