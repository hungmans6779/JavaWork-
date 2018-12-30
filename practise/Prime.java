import java.util.*;
public class Prime
{
 public static void main(String argv[])
 {
  Scanner keyin=new Scanner(System.in);
  while(true)
  {
   System.out.print("請輸入任意整數:");
   int number=keyin.nextInt();
   boolean prime=false;	
   for(int i=2;i<number;i++)
   {
    prime=number%i==0;  //prime true是表是整除
    if(prime)
    {
    	i=number;
    }	 
   }
   if(prime)
    System.out.println(number+"不是質數");
   else
    System.out.println(number+"是質數");
  }  
 }
}