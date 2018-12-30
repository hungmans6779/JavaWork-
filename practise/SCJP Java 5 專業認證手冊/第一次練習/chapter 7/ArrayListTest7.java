import java.util.*;
class IntSert
{
 public void insert(List list)
 {
  list.add(new Integer(3));
 }
}
public class ArrayListTest7
{
 public static void main(String argv[])
 {
  List <Integer>list=new ArrayList<Integer>();
  list.add(1);
  list.add(2);
  IntSert is=new IntSert();
  is.insert(list);
  for(int i:list)
  { System.out.print(i+"\t"); }
 }
}