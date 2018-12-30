import java.util.*;
public class EXAME105
{
 enum Example{ONE,TWO,THREE}	
 public static void main(String argv[])
 {
  Collection coll=new ArrayList();
  coll.add(Example.THREE);
  coll.add(Example.THREE);
  coll.add(Example.THREE);
  coll.add(Example.TWO);
  coll.add(Example.TWO);
  coll.add(Example.ONE);
  Set set=new HashSet(coll);
 }
}