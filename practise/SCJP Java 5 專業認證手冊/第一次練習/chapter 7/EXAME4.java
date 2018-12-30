import java.util.*;
public class EXAME4
{
 public static void main(String argv[])
 {
  List<String>list=new ArrayList<String>();
  list.add(" x");
  list.add("Xx");
  list.add("xx");
  Comparator c=Collections.reverseOrder();
  Collections.sort(list,c);
  //Collections.sort(list);
  for(String s:list)
  { System.out.println(s); }
 }
}