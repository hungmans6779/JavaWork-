import java.util.*;
class Computer<A extends Number>
{
 private Vector<A> v;
 Computer()
 {
 	v=new Vector<A>();
 }		
 public void add(A o)
 {
 	v.add(o);
 }	
 public int size()
 {
 	return v.size();
 }		
}	

public class OwnerTest121
{
 public static void main(String argv[])
 {
  Computer<String> c=new Computer<String>();
  c.add("JAVA ");
  c.add("Tiger ");
  c.add("SCJP 5.0");
  
  System.out.println("c's size:"+c.size());
 }
}