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
public class GenericsSonTest1 extends GenericsFather
{
 public static void main(String argv[])
 {
  Vector<String>v=getMyVector();
  for(String data:v)
  {
   System.out.print(data+"\t");	
  }	
 }
}
