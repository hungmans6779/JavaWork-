import java.util.*;
public class GenericsTest2
{
 public static void main(String argv[])
 {
 	Vector v=new Vector();
 	v.add("SCJP");
 	v.add("Tiger");
 	v.add("SCJP 5.0");
 	Iterator it=v.iterator();
 	while(it.hasNext())
 	{
 	 System.out.print(it.next()+"\t");
 	}
 }		
}	