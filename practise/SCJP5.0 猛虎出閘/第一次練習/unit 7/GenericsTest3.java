import java.util.*;
public class GenericsTest3
{
 public static void main(String argv[])
 {
 	Vector<String>v=new Vector<String>();
 	//v�H�x���ŧi��String���A�A�ҥH����A��䥦���A������...........
 	//v.add(new Integer(5));
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