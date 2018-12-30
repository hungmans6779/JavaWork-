import java.util.*;
public class Test1
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	String input="";
 	int year=0;
 	do
 	{
 	 System.out.print("請輸入年份===>");	
 	 input=scan.next(); 
 	 if(input.matches("\\d*"))
 	 {
 	 	year=Integer.parseInt(input);
 	 	if(year%4==0)
 	 	{
 	 	 if((year%100==0)||(year%4==0))
 	 	 {
 	 	 	if(year%400!=0)
 	 	 	 System.out.println(year+" 年，該年是潤年...");	
 	 	 	else
 	 	 	 System.out.println(year+" 年，該年不是潤年...");	
 	 	 }	
 	 	}
 	 	else
 	 	{
 	 	 System.out.println(year+" 年，該年不是潤年...");	
 	 	}
 	 			
 	 	
 	 	
 	 }	
 	 else
 	 {
 	  System.out.println("您輸入的格式錯誤，請重新輸入");
 	 } 
 	 
 	  		
 		
 	}while(!input.equalsIgnoreCase("q"));
 }	
}	