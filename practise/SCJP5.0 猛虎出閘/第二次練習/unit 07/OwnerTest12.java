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

public class OwnerTest12
{
 public static void main(String argv[])
 {
  Computer<Integer> c=new Computer<Integer>();
  c.add(100);
  c.add(200);
  c.add(300);
  System.out.println("c's size:"+c.size());
 }
}