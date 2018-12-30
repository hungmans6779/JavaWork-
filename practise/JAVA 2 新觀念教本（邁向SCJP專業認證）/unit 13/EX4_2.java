import java.util.*;
public class EX4_2
{
 public static void main(String argv[])
 {
  String a[]={"¸ô»Å°¨","¿ß","¦Ñªê","ª¯","Àd¾m","Àd¤l","¿ß"};
  Set<String> set=new HashSet<String>();
  for(String str:a)
  {
   set.add(str);
  }
  for(String s:set)
  {
   System.out.print(s+"  ");
  }
 }
}