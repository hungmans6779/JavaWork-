import java.util.*;
public class GenericsTest2
{
 public static void main(String argv[])
 {
  Vector <Integer>v=new Vector<Integer>();
  v.add(new Integer(100));
  v.add(new Integer(200));
  v.add(new Integer(300));
  System.out.println("v �����e��:"+v);
  for(Integer value:v)
  {
   Integer data=value;
   System.out.println(data);
   System.out.println("===============");
   System.out.println(data.intValue());	
  }	  
 }
}