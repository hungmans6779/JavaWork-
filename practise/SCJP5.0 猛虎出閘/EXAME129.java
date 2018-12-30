public class EXAME129
{
 public final static String FOO="foo";	
 public static void main(String argv[])
 {
  EXAME129 b=new EXAME129();
  Sub s=new Sub();
  System.out.println("EXAME129.FOO = "+EXAME129.FOO);
  System.out.println("Sub.FOO = "+Sub.FOO);
  System.out.println("b.FOO = "+b.FOO);
  System.out.println("s.FOO = "+s.FOO);
  System.out.println("((EXAME129)s).FOO = "+((EXAME129)s).FOO);
 }
}

class Sub extends EXAME129
{
 public final static String FOO="bar";	
}