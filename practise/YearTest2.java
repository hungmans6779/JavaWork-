import java.util.*;
public class YearTest2
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  System.out.print("�п�J�~��==>");
  int year=scan.nextInt();
  if(year%4==0)
  {
   if(year%100!=0)
   {
   	System.out.println("�O��~");
   }		
   else
   {
   	if((year%400==0)&&(year%100!=0))
   	{
   	 System.out.println("�O��~");	
   	}	
   	else
   	{
   	 System.out.println("���O��~");	
   	}	
   }	
  }
  else
  {
   System.out.println("���O��~");	
  }		
 }
}