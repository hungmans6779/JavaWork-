public class Test31
{
 public static void main(String argv[])
 {
  Character c='A';
  Byte b=10;
  Short s=10;
  Integer i=10;
  Long l=10L;
  Float f=10.0f;
  Double d=10.0;
  System.out.println("==========================");
  ////////////////////////////////////////////
  Long l2=(long)i;
//Long l21=(Long)i;
  Long l22=i.longValue();
  //Integer i=b;
  //Integer i=(byte)b;
  Integer i1=b.intValue();
 }
}