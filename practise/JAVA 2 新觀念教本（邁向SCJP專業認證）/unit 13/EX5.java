import java.util.*;
public class EX5
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
  for(String s:set)
  {
   System.out.print(s+"  ");
  }
 }
}