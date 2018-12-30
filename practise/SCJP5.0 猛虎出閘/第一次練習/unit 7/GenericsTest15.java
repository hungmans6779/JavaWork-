//此範例是錯誤的...............
//泛型所定義的方法不允許覆載........
import java.util.*;
public class GenericsTest15
{
 public static void main(String argv[])
 {
  Vector<String>v1=getMyVector();
  Vector<Integer>v2=getMyVector2();
 }
 static Vector<String>getMyVector()
 {
  Vector<String>v=new Vector<String>();
  v.add("JAVA");
  v.add("SCJP");
  return v;
 }
 static Vector<Integer>getMyVector2()
 {
  Vector<Integer>k=new Vector<Integer>();
  k.add(1);
  k.add(new Integer(2));
  return k;
 }
}