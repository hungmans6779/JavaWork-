import java.util.*;
public class RegexScannerTest2
{
 public static void main(String argv[])
 {
 	System.out.print("請輸入一個IP位址 : ");
 	System.out.flush();
 	try
  {	
   Scanner scan=new Scanner(System.in);
   String str=null;
   do
   {
   	str=scan.findInLine("\\d\\d\\d");
   	System.out.println();
   	System.out.print("數字為: "+str);
   }while(str!=null);	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	 
 }
}