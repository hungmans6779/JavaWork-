import java.util.*;
public class GenericsPolymorphismTest4
{
 public static void main(String arv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  List  v1=v;
  v.add(1);
  v.add(new Integer(2));
  v.add(3);
  v1.add("JAVA");
  Integer i1=v.get(0);
  Integer i2=v.get(1);
  Integer i3=v.get(2);
  System.out.println(i1);
  System.out.println(i2);
  System.out.println(i3);
  String i4=String.valueOf(v.get(3));
  System.out.println(i4);
  
 }
}