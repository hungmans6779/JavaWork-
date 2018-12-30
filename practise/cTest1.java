import java.util.*;
public class cTest1
{
 public static void main(String argv[])
 {	
  byte b1=8;
  System.out.println("b1="+b1);
  Byte b2=new Byte((byte)30);
  System.out.println("b2="+b2);
  b2=new Byte("80");
  System.out.println("b2="+b2);
  //System.out.println(b2.toString());
  //System.out.println(b2.valueOf("30"));
  System.out.println(new Byte("3"));
  Byte b3;
  b3=b2;
  System.out.println("b3="+b3);
 }
}