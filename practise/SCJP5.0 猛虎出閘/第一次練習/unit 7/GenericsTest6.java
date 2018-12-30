import java.util.*;
public class GenericsTest6
{
 public static void main(String argv[])
 {
  Vector<String>v=new Vector();
  //v已經宣告為泛型String型態，所以不能再加入其它型態的元素了......
  //v.add(new Integer(3));
  v.add("JAVA");
  v.add("SCJP");
  for(String data:v)
  {
   System.out.print(data+"\t");	
  }	
 }
}