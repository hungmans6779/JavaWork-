public class InstanceInnerClassTest1
{
 private int x=10;
 public static void main(String argv[])
 {
  new InstanceInnerClassTest1().getInnerClass();
 }
 public void getInnerClass()
 {
 	//InnerClass in=new InnerClass();
 	//in.getX();
 	
  new InnerClass().getX();
 }
 class InnerClass
 {
  public void getX()
  {
   System.out.println(" X = "+x);
  } 
 }
}