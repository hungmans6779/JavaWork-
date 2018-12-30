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
  System.out.println("我是D類別的 bMethod is called!");	
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
   System.out.println("我是E類別的bMethod is called!");		
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