import java.util.*;
public class EXAME104
{
 public static void main(String argv[])
 {
 	Object o1=EXAME104.getO(new ArrayList());
  //Object o2=EXAME104.getO(new ArrayList<?>());
  //String s1=EXAME104.getO(new ArrayList<String>());
  Object o3=EXAME104.getO(new ArrayList<Object>());
  String s2=(String)EXAME104.getO(new ArrayList<String>());
 }
 public static Object getO(List list)
 {
  return list.get(0);	
 }	
}