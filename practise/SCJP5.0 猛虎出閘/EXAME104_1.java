import java.util.*;
public class EXAME104_1
{
 public static Object get(List list)
 {
  return list.get(0);	
 }		
 public static void main(String argv[])
 {
  Object o1=EXAME104_1.get(new LinkedList());
  //Object o2=EXAME104_1.get(new LinkedList<?>());
  //String s3=EXAME104_1.get(new LinkedList<String>());
  Object o4=EXAME104_1.get(new LinkedList<Object>());
  String s5=(String)EXAME104_1.get(new LinkedList<String>());
 }
}