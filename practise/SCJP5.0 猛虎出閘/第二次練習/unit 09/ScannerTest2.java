import java.util.*;
import java.io.*;
public class ScannerTest2
{
 public static void main(String argv[])
 {
  try
  {
   float coat=0;	
   Scanner sc=new Scanner(new File("scanner.txt"));
   sc.useDelimiter(",|#");
   System.out.println("下單資訊:");
   while(sc.hasNextInt())
   {
    System.out.println("--------------------------------");
    int sNo=sc.nextInt();
    String sName=sc.next();
    float price=sc.nextFloat();
    int qty=sc.nextInt();
    System.out.println("股票代號:"+sNo);
    System.out.println("股票名稱:"+sName);
    System.out.println("成交價格:"+price);
    System.out.println("委託數量:"+qty);
    coat +=price*qty*1000;
   } 
   System.out.println("--------------------------------");
   System.out.printf("總成本:NT.%,.2f",coat);
   sc.close();
   
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}