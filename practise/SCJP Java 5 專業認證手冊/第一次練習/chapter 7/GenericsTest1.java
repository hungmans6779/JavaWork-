import java.util.*;
public class GenericsTest1
{
 public static void main(String argv[])
 {
  List list1=new ArrayList();
  list1.add(1);
  //int v1=(Integer)list1.get(0);
  int v1=((Integer)list1.get(0)).intValue();
  System.out.println("v1 = "+v1);
  List<Integer> list2=new ArrayList<Integer>();
  list2.add(2);
  int v2=list2.get(0);
  System.out.println("v2 = "+v2);
 }
}