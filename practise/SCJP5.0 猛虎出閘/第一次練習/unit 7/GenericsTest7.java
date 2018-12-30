import java.util.*;
public class GenericsTest7
{
 public static void main(String argv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  v.add(new Integer(3));
  v.add(new Integer(4));
  v.add(2);
  
  for(Integer data:v)
  {
   Integer value=data;
   System.out.print(value+"\t");	
  }	
 }
}