import java.util.Scanner;
public class ScannerTest4
{
 public static void main(String argv[])
 {
  Scanner sc=new Scanner("100,JAVA");
  sc.useDelimiter(",");
  System.out.println("�п�J�Ʀr:");
  int i=sc.nextInt();
  System.out.println("�п�J�@�Ӧr��:");
  String str=sc.next();
  System.out.println("�z��J���Ʀr�O:"+i);
  System.out.println("�z��J���r��O:"+str);
  sc.close();
 }
}