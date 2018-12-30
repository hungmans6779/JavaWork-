interface A {public void aMethod();}
interface B {public void bMethod();}
interface C {public void cMethod();}
class D implements B
{
 public void bMethod()
 {
  System.out.println("我是class D的類別bMethod()");	
 }
}
public class EXAME133_1 extends D implements C
{
 public void aMethod(){}
 public void bMethod()
 {
  System.out.println("我是class EXAME133_1的類別bMethod()");	
 }
 public void cMethod(){}
 public static void main(String argv[])
 {
 	D e1=new EXAME133_1();
 	e1.bMethod();
 	
 	D e2=(D)(new EXAME133_1());
 	e2.bMethod();
 	
 }	
}