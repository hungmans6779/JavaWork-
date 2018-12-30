import java.util.*;
public class EXAME73
{
 enum Example{ONE,TWO,THREE};
 public static void main(String argv[])
 {
  HashMap<Integer,Example> h=new HashMap<Integer,Example>();
  h.put(1,Example.ONE);
  h.put(2,Example.TWO);
  System.out.println(h);
 }
}