//���d�Ҥ��i��................
public class AbstractTest4
{
 public static void main(String argv[])
 {
  AbstractTest4.Inner=new AbstractTest4.new Inner()
  {
   void move()
   {
   	System.out.println("�ڬO.........");
   }		
  }.move()	;	
 }	
 abstract  class Inner
 {
  abstract void move();
 }
}