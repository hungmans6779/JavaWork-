import java.util.*;
public class Test33
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("請輸入第一個數:");
  int first=scan.nextInt();
  System.out.print("請輸入第二個數:");
  int second=scan.nextInt();
  //第一種方法
  int temp=0;
  if(first<second)
  {
   for(int i=first;i<=second;i++)
   	temp+=i;
  }
  else
  {
   for(int i=second;i<=first;i++)
   	temp+=i;
  }
  System.out.println("第一種方法的總和是:"+temp);		
  //第二種方法
  temp=0;
  if(first<second)
  {
   for(int i=first;i<=second;i++)
   	temp+=i;
  }
  else
  {
   for(int i=first;i>=second;i--)
   	temp+=i;
  }
 System.out.println("第二種方法的總和是:"+temp);		   
 //第三種方法
 temp=0;
 for(int i=(first<second?first:second);i<=(first<second?second:first);i++)
 	temp+=i;	
  System.out.println("第二種方法的總和是:"+temp);		 
 }
}