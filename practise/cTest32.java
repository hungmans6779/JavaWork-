import java.util.*;
public class cTest32
{
 public static void main(String argv[])
 {
  HashSet hs=new HashSet();
  hs.add(new Integer(1));
  hs.add(new Float(23.23f));
  Iterator iter=hs.iterator();
  while(iter.hasNext())
  {
  	System.out.println(iter.next());
  }	
 }
}