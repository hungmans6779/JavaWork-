import java.util.*;
public class EXAME73_2
{
 enum Example{ONE,TWO,THREE}	
 public static void main(String argv[])
 {
  HashMap<Integer,Example>h=new HashMap();
  h.put(1,Example.ONE);
  h.put(2,Example.TWO);
  h.put(3,Example.THREE);
  System.out.println(h);
 }
}