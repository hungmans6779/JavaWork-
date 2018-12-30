public class InterfaceInnerClassExample61 implements Outter61.StaticInnerInterface
{
 public static void main(String argv[])
 {
 	InterfaceInnerClassExample61 tt=new InterfaceInnerClassExample61();
 	tt.access();
 	
 	Outter61 out=new Outter61();
 	Outter61.Innerclass in=out.new Innerclass();
 	in.move(); 
 	
 }	
 public void access()
 {
 	System.out.println("我是StaticInnerInterface....");
 }	
}


class Outter61
{
 static interface StaticInnerInterface
 {
 	public void access();
 }
 interface InnerInterface
 {
  public void move();
 }
 class Innerclass implements InnerInterface
 {
  public void move()
  {
   System.out.println("我會跑呀.....");	
  }	
 }
}