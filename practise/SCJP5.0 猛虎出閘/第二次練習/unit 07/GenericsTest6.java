import java.util.*;
public class GenericsTest6
{
 public static void main(String argv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  v.add(100);
  System.out.println("v�����e��:"+v);
  List v5=v;
  System.out.println("v5�����e��:"+v5);
  System.out.println("================");
  v5.add("SCJP");
  System.out.println("v�����e��:"+v);
  System.out.println("v5�����e��:"+v5);
  Integer i=v.get(0);
  Integer k=v.get(1);
  System.out.println(k);
 }
}