interface A {public void aMethod();}
interface B {public void bMethod();}
interface C {public void cMethod();}
class D implements B
{
 public void bMethod()
 {
  System.out.println("�ڬOclass D�����ObMethod()");	
 }
}
public class EXAME133_1 extends D implements C
{
 public void aMethod(){}
 public void bMethod()
 {
  System.out.println("�ڬOclass EXAME133_1�����ObMethod()");	
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