import java.util.*;
public class CollectionsVectorTest1
{
 public static void main(String argv[])
 {
  Vector <String>v=new Vector<String>();
  v.add("CCCCC");
  v.add("AAAAA");
  v.add("BBBBB");
  System.out.println("Vector �����e��:"+v);
  Collections.sort(v);
  System.out.println("Vector �����e��:"+v);
 }
}