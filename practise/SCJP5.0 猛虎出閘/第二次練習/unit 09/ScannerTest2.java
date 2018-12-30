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
   System.out.println("虫戈癟:");
   while(sc.hasNextInt())
   {
    System.out.println("--------------------------------");
    int sNo=sc.nextInt();
    String sName=sc.next();
    float price=sc.nextFloat();
    int qty=sc.nextInt();
    System.out.println("布腹:"+sNo);
    System.out.println("布嘿:"+sName);
    System.out.println("Θユ基:"+price);
    System.out.println("〆癠计秖:"+qty);
    coat +=price*qty*1000;
   } 
   System.out.println("--------------------------------");
   System.out.printf("羆Θセ:NT.%,.2f",coat);
   sc.close();
   
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}