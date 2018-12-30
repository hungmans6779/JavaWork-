import java.util.*;
public class CollectionsTest1
{ 
 public static void main(String argv[])
 {
  Vector v=new Vector();
  v.add("CCCCCCC");
  v.add("BBBBBBB");
  v.add("EEEEEEE");
  v.add("AAAAAAA");
  v.add("KKKKKKK");
  System.out.println("排序前的內容為:"+v.toString());
  Collections.sort(v);
  System.out.println("排序後的內容為:"+v.toString()); 
 }
}