import java.util.*;
public class EX4
{
 public static void main(String argv[])
 {
  String a[]={"¸ô»Å°¨","¿ß","¦Ñªê","ª¯","Àd¾m","Àd¤l","¿ß"};
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