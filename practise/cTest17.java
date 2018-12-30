import java.util.*;
public class cTest17
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  int value[]=new int[3];
  for(int i=0;i<=2;i++)
  {
   System.out.print("請輸入第"+(i+1)+"個數值===>");
   value[i]=scan.nextInt();
  }	
  System.out.println();
  int total=0;
  for(int data:value)
   total+=data;
  System.out.println("您輸入的數值加總為:"+total);
 }
}