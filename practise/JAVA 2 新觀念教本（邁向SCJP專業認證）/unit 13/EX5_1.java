import java.util.*;
public class EX5_1
{
 public static void main(String argv[])
 {
  String a[]={"¸ô»Å°¨","¿ß","¦Ñªê","ª¯","Àd¾m","Àd¤l","¿ß"};
  LinkedHashSet<String> set=new LinkedHashSet<String>();
  for(String str:a)
  {
   set.add(str);
  }
  set.add("¥[µá¿ß");
  Iterator it=set.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"  ");
  }
 }
}