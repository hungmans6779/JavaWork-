import java.util.Scanner;
public class ScannerTest1
{
 public static void main(String argv[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("�п�J�Ʀr:");
  int i=sc.nextInt();
  System.out.print("�п�J�@�Ӧr��:");
  String str=sc.next();
  System.out.println("�z��J���Ʀr�O:"+i);
  System.out.println("�z��J���r��O:"+str);
  sc.close();
 }
}