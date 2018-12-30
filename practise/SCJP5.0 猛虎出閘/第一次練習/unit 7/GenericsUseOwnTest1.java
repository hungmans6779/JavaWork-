import java.util.*;
public class GenericsUseOwnTest1
{
 public static void  main(String argv[])
 {
  GenericsOwn<Integer> g=new GenericsOwn<Integer>();
  g.add(100);
  g.add(new Integer(200));
  g.add(300);
  System.out.println("共有: "+g.size()+" 個元素");
 }
}