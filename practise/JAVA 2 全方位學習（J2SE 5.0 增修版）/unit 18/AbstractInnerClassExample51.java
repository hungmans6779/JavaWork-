public class AbstractInnerClassExample51 extends Outter51.AbstractInnerClass51
{
 public static void main(String argv[])
 {
 	access();
 	
 	Outter51 out=new Outter51();
 	Outter51.Inner51 in=out.new Inner51();
 	in.move();	
 }	
}

class Outter51
{
 public static abstract class AbstractInnerClass51
 {
 	public static void access()
 	{
 	 System.out.println("我是AbstractInnerClass51.....");	
 	}	
 }		
 public abstract class AbstractInner51 
 {
 	public abstract void move();
 }
 public class Inner51 extends AbstractInner51
 {
 	public void move()
 	{
 	 System.out.println("我會移動喔");	
 	}	
 }		
}	
	