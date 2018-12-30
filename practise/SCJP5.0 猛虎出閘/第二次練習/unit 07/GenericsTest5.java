import java.util.*;
public class GenericsTest5
{
 public static void main(String argv[])
 {
  Vector <String> v=getVector();
  System.out.println("v 的內容為:"+v);
  Iterator<String>it=v.iterator();
  while(it.hasNext())
  {
   String data=it.next();
   System.out.print(data+",");	
  }	
 }
 
 public static Vector<String>getVector()
 {
 	Vector<String> v=new Vector<String>();
 	v.add("Java ");
 	v.add("Tiger ");
 	v.add("SCJP 5.0");
 	return v;
 }		
}