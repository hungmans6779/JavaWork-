import java.util.*;
public class EXAME103
{
 public static void main(String argv[])
 {
  List list1=new ArrayList(); 
  test(list1);
  /*
  List<String> list2=new ArrayList<String>();
  test(list2);
  */
  
  List<Object>list3=new ArrayList<Object>();
  test(list3);
  
  /*
  List<Object>list4=new List<String>();
  test(list4);
  */
 }
 public static void test(List<Object>list)
 {
 	System.out.println(list);
 }	 
}