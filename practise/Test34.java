import java.util.*;
public class Test34
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  String str="";
  while(true)
  {
   System.out.print("請輸入任一整數:");	
   int number=scan.nextInt(); 	
   int temp=number;
   boolean answer=true;
   for(int i=2;i<=number/2+1;i+=i==2?1:2)
   {
    answer=(number%i==0); //number%i==0是true時，代表不是質數
    if(answer)
    { i=number; }
   }		
   if(answer)
    System.out.println(temp+"不是質數");
   else
    System.out.println(temp+"是質數");
   System.out.println("======================"); 
  }
 }
}