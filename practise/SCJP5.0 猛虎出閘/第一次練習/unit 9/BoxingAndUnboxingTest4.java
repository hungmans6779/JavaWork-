public class BoxingAndUnboxingTest4
{
 public static void main(String argv[])
 {
  Character c='A';  // Character character = Character.valueOf('A');
  Byte b=10;        // Byte byte1 = Byte.valueOf((byte)10);
  Short s=10;       // Short short1 = Short.valueOf((short)10);
  Integer i=10;     // Integer integer = Integer.valueOf(10);
  Long l=10l;       // Long long1 = Long.valueOf(10L);
  Float f=10.0f;    // Float float1 = Float.valueOf(10F);
  Double d=10.0;    // Double double1 = Double.valueOf(10D);
  
  Long l2=(long)i;                        //Long long2 = Long.valueOf(integer.intValue());
  //Long l3=(Long)i;
  Long l3=Long.valueOf(i.intValue());     // Long long3 = Long.valueOf(integer.intValue());
  Long l4=Long.valueOf(i);                // Long long4 = Long.valueOf(integer.intValue());
  Long l5=i.longValue();                  // Long long5 = Long.valueOf(integer.longValue());
  //Integer i1=b;
  //Integer i1=(byte)b;
  Integer i1=(int)b;                     // Integer integer1 = Integer.valueOf(byte1.byteValue());
  Integer i2=b.intValue();               // Integer integer2 = Integer.valueOf(byte1.intValue());
  int  ii=10;
  long ll=10l;
  ll=ii;
 }
}