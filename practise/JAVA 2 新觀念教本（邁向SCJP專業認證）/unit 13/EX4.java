import java.util.*;
public class EX4
{
 public static void main(String argv[])
 {
  String a[]={"���Ű�","��","�Ѫ�","��","�d�m","�d�l","��"};
  HashSet<String> set=new HashSet<String>();
  for(String str:a)
  {
   set.add(str);
  }
  Iterator it=set.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"  ");
  }
 }
}