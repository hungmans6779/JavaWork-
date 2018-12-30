import java.util.*;
public class Test021
{
 public static void main(String argv[])
 {
 	Scanner kegin=new Scanner(System.in);
 	System.out.print("請輸入一個數值===>");
 	int input=kegin.nextInt();
 	if(input>0)
 	{
 	 System.out.print(input+"是正數");	
 	}	
 	else
 	{
 	 System.out.println(input+"是負數");	
 	}	
 }		
}