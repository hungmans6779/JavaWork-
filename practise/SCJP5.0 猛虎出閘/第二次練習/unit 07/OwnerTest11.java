import java.util.*;
class Computer<Integer>
{
 private Vector<Integer> v;
 Computer()
 {
 	v=new Vector<Integer>();
 }		
 public void add(Integer o)
 {
 	v.add(o);
 }	
 public int size()
 {
 	return v.size();
 }		
}	

public class OwnerTest11
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