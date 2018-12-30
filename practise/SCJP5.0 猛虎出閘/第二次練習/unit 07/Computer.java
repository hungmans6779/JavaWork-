import java.util.*;
public class Computer<A>
{
 Vector<A>v;
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