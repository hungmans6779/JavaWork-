import java.util.*;
public class EXAME109
{
 public static void main(String argv[])
 {
  HashMap props=new HashMap();
  props.put("key45","some value");
  props.put("key12","some other value");
  props.put("key39","yet another value");
  Set s=props.keySet();
  System.out.println(s);
  //Collections.sort(s); //Collections.sort(List list); 只接受List 的型別
  s=new TreeSet(s);
  System.out.println(s);
  
 }
}