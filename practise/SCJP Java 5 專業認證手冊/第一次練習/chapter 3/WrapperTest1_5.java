public class WrapperTest1_5
{
 public static void main(String argv[])
 {
  Integer i1=new Integer(235);
  byte b=i1.byteValue();
  short s=i1.shortValue();
  float f=i1.floatValue();
  System.out.println("b="+b);
  System.out.println("s="+s);
  System.out.println("f="+f);
  Float ff=new Float(3535.23f);
  int ii=ff.intValue();
  System.out.println("ii="+ii);
  
 }
}