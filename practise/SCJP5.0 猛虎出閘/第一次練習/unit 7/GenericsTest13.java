import java.util.*;
public class GenericsTest13
{
 public static void main(String argv[])
 {
  Vector<String>v=new GenericsTest13().getMyVector();
  Iterator<String>it=v.iterator();
  while(it.hasNext())
  {
   String data=it.next();	
   System.out.print(data+"\t");
   //System.out.print(it.next()+"\t");
  }
 }
  Vector<String>getMyVector()
 {
  Vector<String>v=new Vector<String>();
  v.add("Tiger");
  v.add("JAVA");
  v.add("SCJP");
  return v;	
 }
}