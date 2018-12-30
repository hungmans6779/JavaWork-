public class MyObjectv5
{
 public int data;
 public MyObjectv5(int i)
 {
  data=i;
 }
 public boolean equals(Object obj)
 {
  if(obj!=null && (obj instanceof MyObjectv5))
   if (this.data==((MyObjectv5)obj).data)
     return true;
    
    return false;    
 }
  public int hashCode()
  {
    return(new Integer(data).hashCode());
  }
}