import java.util.*;
public class ComparatorTest1
{
 public static void main(String argv[])
 {	
  Comparator<String> c=new Comparator<String>()
  {
  	public int compare(String a,String b)
  	{
  	 return a.compareTo(b) * -1;	
  	}	
  };	
 
  PriorityQueue <String>p=new PriorityQueue <String>(3,c);
  p.offer("a");
  p.offer("b");
  p.offer("c");
  System.out.println(p.toString());
  while(p.peek()!=null)
  {
 	 System.out.print(p.poll()+"\t");
  }	
  System.out.println();
  System.out.println(p.toString());
 } 
}