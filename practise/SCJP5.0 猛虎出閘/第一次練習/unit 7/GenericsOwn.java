import java.util.*;
public class GenericsOwn<A>
{
 private Vector<A> v;
 public GenericsOwn()
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