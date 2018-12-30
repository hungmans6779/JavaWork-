import java.util.*;
public class ScannerTest12
{
 public static void main(String argv[])
 {
  Scanner sc=new Scanner("100,Java");
  sc.useDelimiter(",");
  System.out.println("您輸入的數字是:"+sc.nextInt());
  System.out.println("您輸入的字串是:"+sc.next());
 }
}