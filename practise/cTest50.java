import java.util.*;
public class cTest50
{
 public static void main(String argv[])
 {
 	HashSet hs=new HashSet();
 	for(int i=0;i<100;i++)
 	 hs.add(new Random().nextInt(100)+1);	
 	System.out.println(hs);
 }		
}