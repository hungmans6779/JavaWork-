public class InnerClassExample2
{
 public static void main(String argv[])
 {
  InnerClass out=new InnerClass();
  InnerClass.InstantiateInnerClass in=out.new InstantiateInnerClass();
  in.access();
 }
}