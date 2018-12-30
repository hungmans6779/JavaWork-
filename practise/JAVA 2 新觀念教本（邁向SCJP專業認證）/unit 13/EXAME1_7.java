import java.util.*;
public class EXAME1_7
{
 public static void main(String argv[])
 {
  LinkedHashSet<String>set=new LinkedHashSet<String>();
  String s[]={"S","T","S","R","S","P"};
  for(String str:s)
  {
   set.add(str);	
  }	
  System.out.println(set);
 } 
}