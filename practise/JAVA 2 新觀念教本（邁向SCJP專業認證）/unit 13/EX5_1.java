import java.util.*;
public class EX5_1
{
 public static void main(String argv[])
 {
  String a[]={"���Ű�","��","�Ѫ�","��","�d�m","�d�l","��"};
  LinkedHashSet<String> set=new LinkedHashSet<String>();
  for(String str:a)
  {
   set.add(str);
  }
  set.add("�[���");
  Iterator it=set.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"  ");
  }
 }
}