import java.util.*;
public class GenericsTest51
{
 public static void main(String argv[])
 {
  Vector <String> v=getVector();
  System.out.println("v �����e��:"+v);
  Iterator<String>it=v.iterator();
  while(it.hasNext())
  {
   String data=it.next();
   System.out.print(data+",");	
  }	
 }
 
 public static Vector getVector()
 {
 	Vector v=new Vector();
 	v.add("Java ");
 	v.add("Tiger ");
 	v.add("SCJP 5.0");
 	return v;
 }		
}