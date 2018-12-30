import java.util.*;
public class EXAME066
{
 public static int sum(List intList)
 {
  int sum=0;
  for(Integer iter=intList.iterator();iter.hasNext())
  {
   int i=((Integer)iter.next().intValue();
   sum+=i;	
  }
 	return sum;
 }		
	
 public static void main(String argv[])
 {
  
 }
}