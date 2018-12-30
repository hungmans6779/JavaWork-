import java.util.*;
public class EXAME104
{
 public static void main(String argv[])
 {
  Object o1=EXAME104.getO(new LinkedList());
  
  //Object o2=EXAME104.getO(new LinkedList<?>()); //½sÄ¶¥¢±Ñ
  //String s1=EXAME104.getO(new LinkedList<String>()); //½sÄ¶¥¢±Ñ 

  Object o3=EXAME104.getO(new LinkedList<Object>());
  String s2=(String)EXAME104.getO(new LinkedList<String>());
 }
 public static Object getO(List<?> list)
 {	
 	return list.get(0);
 }	
}