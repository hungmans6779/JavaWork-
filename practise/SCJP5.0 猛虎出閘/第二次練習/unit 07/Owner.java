import java.util.*;
public class Owner<A>
{
 private Vector<A> v;
 Owner()
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