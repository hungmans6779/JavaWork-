import java.util.*;
public class EXAME111
{
 public void test(List<? extends String>list)
 {
  //list.add("Foo");
  list=new ArrayList<String>();
  //list=new ArrayList<Object>();
  String str1=list.get(0);
  Object o=list;
  
 
 }
 public static void main(String argv[])
 {
 
 }
}