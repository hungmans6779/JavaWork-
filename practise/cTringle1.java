import java.util.*;
public class cTringle1
{
 public static void main(String argv[])
 {	
 	System.out.println("�Ĥ@�ӹϧ�");	
  for(int i=4;i>=-4;i--)
  {   
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("  ");
   for(int j=0;j<=4-Math.abs(i);j++)
    System.out.print("* ");
   System.out.println();     
  } 
  System.out.println("�ĤG�ӹϧ�");
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("   ");
   for(int j=0;j<=4-Math.abs(i);j++)
    System.out.print("* ");
   System.out.println();     
  } 
  
  System.out.println("�ĤT�ӹϧ�");  
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("   ");
   for(int j=0;j<=4-Math.abs(i);j++)
    System.out.print("*     ");
   System.out.println();     
  } 
  
  
  System.out.println("�ĥ|�ӹϧ�");  
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("*  ");	
   System.out.println();     
  } 
  
  System.out.println("�Ĥ��ӹϧ�");  
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("*   ");
   for(int j=0;j<4-Math.abs(i);j++)
    System.out.print("    ");
    
   for(int j=1;j<4-Math.abs(i);j++)
    System.out.print("    ");

   for(int j=0;j<=(i==4 || i==-4 ?Math.abs(i)-1:Math.abs(i));j++)
    System.out.print("*   ");
   System.out.println();     
  } 
  
  
 }
}