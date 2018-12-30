import java.util.*;
public class GenericsPolymorphismTest3
{
 public static void main(String arv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  v.add(1);
  List  v1=v;
  v.add(new Integer(2));
  v.add(3);
  v1.add("JAVA");
  System.out.println(v.get(0));
  System.out.println(v.get(1));
  System.out.println(v.get(2));
  System.out.println(v.get(3));
  
 }
}