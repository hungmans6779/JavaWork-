public class Test62
{
 public static void main(String argv[])
 {
  Float f=new Float("3.43f");
  byte b=f.byteValue();
  short s=f.shortValue();
  System.out.println("b="+b);
  System.out.println("s="+s);
 }
}