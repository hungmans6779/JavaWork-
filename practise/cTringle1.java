import java.util.*;
public class cTringle1
{
 public static void main(String argv[])
 {	
 	System.out.println("第一個圖形");	
  for(int i=4;i>=-4;i--)
  {   
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("  ");
   for(int j=0;j<=4-Math.abs(i);j++)
    System.out.print("* ");
   System.out.println();     
  } 
  System.out.println("第二個圖形");
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("   ");
   for(int j=0;j<=4-Math.abs(i);j++)
    System.out.print("* ");
   System.out.println();     
  } 
  
  System.out.println("第三個圖形");  
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("   ");
   for(int j=0;j<=4-Math.abs(i);j++)
    System.out.print("*     ");
   System.out.println();     
  } 
  
  
  System.out.println("第四個圖形");  
  for(int i=4;i>=-4;i--)
  {
   for(int j=0;j<=Math.abs(i);j++)
    System.out.print("*  ");	
   System.out.println();     
  } 
  
  System.out.println("第五個圖形");  
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