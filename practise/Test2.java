import java.util.*;
public class Test2
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	String input="";
 	int year=0;
 	do
 	{
 	 System.out.print("�п�J�~��===>");	
 	 input=scan.next(); 
 	 if(input.matches("\\d*"))
 	 {
 	 	year=Integer.parseInt(input); 	 	
 	 	if((year%4==0 || year%100==0) && (year%400!=0))
 	 	  System.out.println(year+" �~�A�Ӧ~�O��~...");	
 	 	else
 	 	  System.out.println(year+" �~�A�Ӧ~���O��~...");	
 	 }	
 	 else
 	 {
 	 	if(!input.equalsIgnoreCase("q"))
 	   System.out.println("�z��J���榡���~�A�Э��s��J");
 	  else
 	   System.out.println("���¨ϥΥ��t��.....");
 	 } 
 	}while(!input.equalsIgnoreCase("q"));
 }	
}	