//此範例不可行................
public class AbstractTest4
{
 public static void main(String argv[])
 {
  AbstractTest4.Inner=new AbstractTest4.new Inner()
  {
   void move()
   {
   	System.out.println("我是.........");
   }		
  }.move()	;	
 }	
 abstract  class Inner
 {
  abstract void move();
 }
}