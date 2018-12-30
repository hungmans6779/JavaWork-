public class Test3
{
 public static void main(String argv[])
 {
  int a=330,b=22,temp=0;
  while(b!=0)
  {
   temp=a%b;
   a=b;
   b=temp;	
  }	
  System.out.println("最大公因數是："+a);
 }
}