import java.io.*;
import java.util.Scanner;
public class ScannerTest5
{
 public static void main(String argv[])
 {
  try
  {
   Scanner sc=new Scanner(new File("Scanner.txt"));
   sc.useDelimiter(",|#");
   System.out.println("虫戈癟");
   float cost=0;
   while(sc.hasNextInt())
   {
   	int id=sc.nextInt();
   	String name=sc.next();
   	float pty=sc.nextFloat();
   	int pay=sc.nextInt();
   	System.out.println("----------------------------------");
   	System.out.println("布腹 : "+id);
   	System.out.println("布嘿 : "+name);
   	System.out.println("Θユ基 : NT. "+pty);
   	System.out.println("〆癠眎计 : "+pay);
   	cost+=pty*pay*1000;
   }	
   System.out.println("====================================");
   System.out.printf("羆Θセ: NT. %,.2f%n",cost);
   sc.close();
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
   System.out.println(ioe.getLocalizedMessage());
   System.out.println(ioe.getMessage());
  } 
 }
}