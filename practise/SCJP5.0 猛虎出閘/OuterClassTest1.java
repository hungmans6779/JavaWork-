public class OuterClassTest1
{
 public static void main(String argv[])
 {
 	
 	OuterClassTest1.InstanceInnerClass iic=new OuterClassTest1().new InstanceInnerClass();
 	System.out.println("iic.legs = "+iic.legs);
 	System.out.println("iic.color = "+iic.color);
 	System.out.println("=========================================================");
 	
 	System.out.println("StaticInnerClass.slegs = "+StaticInnerClass.slegs);
 	System.out.println("StaticInnerClass.scolor = "+StaticInnerClass.scolor);
 	
 	//執行方法內部類別
  OuterClassTest1 oct=new OuterClassTest1();
  oct.showInnerClass();
 
 }
 class InstanceInnerClass
 {
  public int legs=4;
  public String color="Yellow";
 }
 static class StaticInnerClass
 {
 	public static int slegs=2;
 	public static String scolor="Red";
 }	
 public void showInnerClass()
 {
 	class MethodInnerClass
 	{
 	 int mlegs=4;
 	 String mcolor="Green";
 	}
 	MethodInnerClass mic=new MethodInnerClass();
  System.out.println("=========================================================");
 	System.out.println("mlegs = "+mic.mlegs);
 	System.out.println("mcolor = "+mic.mcolor);
 }	
}