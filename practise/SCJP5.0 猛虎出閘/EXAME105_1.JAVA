import java.util.*;
public class EXAME105_1
{
 enum Example{ONE,TWO,THREE}	
 public static void main(String argv[])
 {
  Collection<Example> coll=new ArrayList<Example>();
  coll.add(Example.THREE);
  coll.add(Example.THREE);
  coll.add(Example.THREE);
  coll.add(Example.TWO);
  coll.add(Example.TWO);
  coll.add(Example.ONE);
  for(Example ex:coll)
  {
   System.out.print(ex+"\t");
  }	
  System.out.println();
  Set set=new HashSet(coll);
  Iterator it=set.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"  ");	
  }	
 }
}