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
   System.out.println("�U���T");
   float cost=0;
   while(sc.hasNextInt())
   {
   	int id=sc.nextInt();
   	String name=sc.next();
   	float pty=sc.nextFloat();
   	int pay=sc.nextInt();
   	System.out.println("----------------------------------");
   	System.out.println("�Ѳ��N�� : "+id);
   	System.out.println("�Ѳ��W�� : "+name);
   	System.out.println("������� : NT. "+pty);
   	System.out.println("�e�U�i�� : "+pay);
   	cost+=pty*pay*1000;
   }	
   System.out.println("====================================");
   System.out.printf("�`������: NT. %,.2f%n",cost);
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