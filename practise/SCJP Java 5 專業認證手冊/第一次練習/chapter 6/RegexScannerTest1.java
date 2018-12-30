import java.util.*;
public class RegexScannerTest1
{
 public static void main(String argv[])
 {
 	System.out.print("請輸入一個欲搜尋的字串 : ");
 	System.out.flush();
 	try
  {	
   Scanner scan=new Scanner(System.in);
   String str=null;
   do
   {
   	str=scan.findInLine(argv[0]);
   	System.out.println();
   	System.out.print("found : "+str);
   }while(str!=null);	
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	 
 }
}