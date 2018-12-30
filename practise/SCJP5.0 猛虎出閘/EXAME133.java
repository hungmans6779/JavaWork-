interface A {public void aMethod();}
interface B {public void bMethod();}
interface C {public void cMethod();}
class D implements B
{
 public void bMethod(){}
}
public class EXAME133 extends D implements C
{
 public void aMethod(){}
 public void bMethod(){}
 public void cMethod(){}
 public static void main(String argv[])
 {
 	
 }	
}