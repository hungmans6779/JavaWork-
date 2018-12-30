public class Byte1
{
 public static void main(String argv[])
 {
 	byte bb1=1,bb2=1,bb3=3;
  Byte b1=new Byte(bb1);
  Byte b2=new Byte(bb2);
  Byte b3=new Byte(bb3);
  System.out.println(b1.compareTo(new Byte(b2)));
  System.out.println(b1.compareTo(b2));
  System.out.println(b1.compareTo(b3));
  System.out.println(b3.compareTo(b1));
  System.out.println(b1.equals(b2));
  System.out.println(b1.equals(b3));
 
 }
}