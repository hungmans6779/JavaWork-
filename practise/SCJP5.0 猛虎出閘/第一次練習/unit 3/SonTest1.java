class Father
{
 void aMethod()
 {
  System.out.println("Father");
 }
}

public class SonTest1 extends Father
{
 void aMethod()
 {
  // super.aMethod();
  System.out.println("Son");
 }
 public static void main(String argv[])
 {
  new SonTest1().aMethod();
 }
}