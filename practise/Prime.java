import java.util.*;
public class Prime
{
 public static void main(String argv[])
 {
  Scanner keyin=new Scanner(System.in);
  while(true)
  {
   System.out.print("�п�J���N���:");
   int number=keyin.nextInt();
   boolean prime=false;	
   for(int i=2;i<number;i++)
   {
    prime=number%i==0;  //prime true�O��O�㰣
    if(prime)
    {
    	i=number;
    }	 
   }
   if(prime)
    System.out.println(number+"���O���");
   else
    System.out.println(number+"�O���");
  }  
 }
}