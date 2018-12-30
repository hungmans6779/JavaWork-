//此範例是錯誤的...............
//泛型所定義的方法不允許覆寫的........
import java.util.*;
class GenericsFather
{
 public static Vector<String>getMyVector()
 {
  Vector<String>v=new Vector<String>();
  v.add(new String("JAVA"));
  v.add("SCJP");
  return v;
 }
}
public class GenericsSonTest2 extends GenericsFather
{
 public static void main(String argv[])
 {
  Vector<String>v=getMyVector();
  for(String data:v)
  {
   System.out.print(data+"\t");	
  }	
 }
 static Vector<String>getMyVector()
 {
  Vector<String>k=new Vector<String>();
  k.add(new String("NCCE"));
  k.add("MCSE");
  return k;
 }
}
