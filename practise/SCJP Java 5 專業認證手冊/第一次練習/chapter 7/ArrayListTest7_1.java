import java.util.*;
class IntSert
{
 public void insert(List list)
 {
  list.add(new String("Java"));
 }
}
public class ArrayListTest7_1
{
 public static void main(String argv[])
 {
  List <Integer>list=new ArrayList<Integer>();
  list.add(1);
  list.add(2);
  //list.add(new String("Hello"));
  IntSert is=new IntSert();
  is.insert(list);
  for(int i:list)
  { System.out.print(i+"\t"); }
 }
}