public class MyObjectv4
{
 private int data;
 public MyObjectv4(int i)
 {
  data=i;
 }
 public boolean equals(Object obj)
 {
  if(obj!=null && (obj instanceof MyObjectv4))
   if (this.data==((MyObjectv4)obj).data)
     return true;
    
    return false;    
 }
  public int hashCode()
  {
    return(new Integer(data).hashCode());
  }
}