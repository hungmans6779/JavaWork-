class Father
{
 private final void aMethod()
 {
  System.out.println("我是父類別");
 }
}
public class EXAME022_1 extends Father
{
 private final void aMethod()
 {
  System.out.println("我是子類別");
 }	
 public static void main(String argv[])
 {
  new EXAME022_1().aMethod();
 }
}