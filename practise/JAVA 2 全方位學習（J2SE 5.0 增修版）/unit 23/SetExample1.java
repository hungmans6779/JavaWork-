import java.util.*;
public class SetExample1
{
 public static void main(String argv[])
 {
 	HashSet set=new HashSet();
 	set.add(new Integer(5));
 	set.add(new String("abc"));
 	set.add(new Double(1.2));
 	set.add(new Integer(5));
 	set.add(new String("abc"));
 	System.out.println("HashSet()的內容為 ： "+set);
 	
 }	
}