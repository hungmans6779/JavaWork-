public class CallInstanceInnerClassTest1
{
 public static void main(String argv[])
 {
  InstanceInnerClassTest1 out=new InstanceInnerClassTest1();
  InstanceInnerClassTest1.InnerClass in=out.new InnerClass();
  in.getX();
 }
}