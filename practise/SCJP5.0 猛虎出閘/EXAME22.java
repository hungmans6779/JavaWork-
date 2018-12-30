class Father
{
 public static void aMethod()
 {
  System.out.println("父親被呼叫到了");
 }
}
public class EXAME22 extends Father
{
 public static void main(String argv[])
 {
  aMethod();
 }
}