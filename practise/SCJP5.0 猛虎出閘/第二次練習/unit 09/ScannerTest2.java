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
   System.out.println("�U���T:");
   while(sc.hasNextInt())
   {
    System.out.println("--------------------------------");
    int sNo=sc.nextInt();
    String sName=sc.next();
    float price=sc.nextFloat();
    int qty=sc.nextInt();
    System.out.println("�Ѳ��N��:"+sNo);
    System.out.println("�Ѳ��W��:"+sName);
    System.out.println("�������:"+price);
    System.out.println("�e�U�ƶq:"+qty);
    coat +=price*qty*1000;
   } 
   System.out.println("--------------------------------");
   System.out.printf("�`����:NT.%,.2f",coat);
   sc.close();
   
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }		
 }
}