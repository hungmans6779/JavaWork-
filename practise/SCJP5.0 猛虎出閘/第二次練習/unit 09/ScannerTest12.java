import java.util.*;
public class ScannerTest12
{
 public static void main(String argv[])
 {
  Scanner sc=new Scanner("100,Java");
  sc.useDelimiter(",");
  System.out.println("�z��J���Ʀr�O:"+sc.nextInt());
  System.out.println("�z��J���r��O:"+sc.next());
 }
}