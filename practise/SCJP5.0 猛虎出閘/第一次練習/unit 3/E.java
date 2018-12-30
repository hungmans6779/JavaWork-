interface A
{
 public void aMethod();
}
interface B
{
 public void bMethod();
}
interface C extends A,B
{
 public void cMethod();
}

class D implements B
{
 public void bMethod()
 {
  System.out.println("�ڬOD���O�� bMethod is called!");	
 }
}

class E extends D implements C
{
 public void aMethod()
 {
   System.out.println("aMethod is called!");	
 }
 public void bMethod()
 {
   System.out.println("�ڬOE���O��bMethod is called!");		
 }
 public void cMethod()
 {
   System.out.println("cMethod is called!");		
 }
 public static void main(String argv[])
 {
  D e=(D)(new E());
  e.bMethod();	
 }	
}