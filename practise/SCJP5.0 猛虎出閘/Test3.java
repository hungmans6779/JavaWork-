import java.util.*;
public class Test3
{
 public static void main(String argv[])
 {
  HashSet<Object> has1=new HashSet<Object>();
  has1.add(new String("1"));
  has1.add(new String("1"));
  has1.add(new String("2"));
  System.out.println("has1.size = "+has1.size());
  HashSet has2=new HashSet();
  has2.add(new String("test"));
  has2.add(new Integer(2));
  has2.add(new Float(23.23));
  System.out.println("has2.size = "+has2.size());
 }
}