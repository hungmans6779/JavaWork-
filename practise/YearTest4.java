import java.util.*;
public class YearTest4
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  int year;
  while(true)
  {
   System.out.print("�п�J�~��==>");
   year=scan.nextInt();
   if(year%400!=0)
   {
   	if(year%100!=0)
   	 System.out.println("�O��~");
   	else
   	 System.out.println("���O��~");
   }
   else
   {
   	if((year%4==0)&&(year%100!=0))
     System.out.println("�O��~");	
    else
     System.out.println("���O��~");
   }		
  }  
 }
}