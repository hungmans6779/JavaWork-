import java.util.*;
public class Test1
{
 public static void main(String argv[])
 {
 	Comparator<String> c=new Comparator<String>()
 	{
 	 public int compare(String a,String b)
 	 {
 	 	return a.compareTo(b)*-1;
 	 }		
 	};	 	

  LinkedHashSet <String>ll=new LinkedHashSet<String>(c);
 }
}